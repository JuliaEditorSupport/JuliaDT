module EclipseREPL
function execute(statement)
  status="complete"
  mimeType="text/plain"
  try
    expression = parse(statement,1; greedy=true, raise=false)
    if isa(expression[1],Expr)
      state = expression[1].head
    else
      state = nothing
    end
    status = state==:incomplete ? "incomplete" : state==:error ? "error" : "complete"
    result=nothing
    if(status!="complete")
      return
    end
    result=include_string(statement)
    if result==nothing
      return
    end
    #status=="complete" and result!=nothing
    response=stringmime("text/plain",result)
    resultType = string(typeof(result))
    if resultType=="Gadfly.Plot"
      mimeType = "text/html"
      writemime(STDOUT, mimeType,result)
    elseif contains(response,"matplotlib")
      mimeType = "text/html"
      pkg = symbol("PyPlot")
      eval(:($(Expr(:using, pkg))))
      figure = PyPlot.gcf()
      pygui(false) # after the fact - review
      writemime(STDOUT,"image/svg+xml",figure)
    else
      println(response)
    end
  catch e
    showerror(STDOUT, e); println()
    status = "error"
    println()
  finally
    flush_all()
    println("<<<<$status>>>>")
    println("<<<<$mimeType>>>>")
    println("<<<<eox>>>>")
  end
end
function flush_all()
    Libc.flush_cstdio()
    flush(STDOUT)
    flush(STDERR)
end
using Base
function Base.workspace()
    last = Core.Main
    b = last.Base
    e = EclipseREPL
    ccall(:jl_new_main_module, Any, ())
    m = Core.Main
    ccall(:jl_add_standard_imports, Void, (Any,), m)
    eval(m,
         Expr(:toplevel,
              :(const Base = $(Expr(:quote, b))),
              :(const LastMain = $(Expr(:quote, last))),
              :(const EclipseREPL = $(Expr(:quote, e)))))
    empty!(Base.package_locks)
    nothing
end
end
