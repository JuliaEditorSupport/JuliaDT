module EclipseREPL
function equivalent(command)
  if(strip(command)=="?")
    return helpcode("?")
  end
  hcode = replace(command, r"^\s*\?", "")
  if hcode != command
    return helpcode(hcode)
  end
  return command
end
function validate(statement)
  expression = parse(statement,1; greedy=true, raise=false)
  if !isa(expression[1],Expr)
    return (:complete,statement)
  end
  if expression[1].head==:error
    return (expression[1].head, expression[1].args[1])
  end
  return (expression[1].head,nothing)
end
function execute(command)
  status = nothing
  mimeType=nothing
  try
    statement = equivalent(command)
    state,message = validate(statement)
    status=string(state)
    if(state==:error)
      status="error"
      println(message)
      return
    end
    if(state==:incomplete)
      status="incomplete"
      return
    end
    status="complete"
    result=include_string(statement)
    if result==nothing
      return
    end
    response=stringmime("text/plain",result)
    resultType = string(typeof(result))
    if resultType=="Gadfly.Plot"
      mimeType = "text/html"
      println(stringmime(mimeType,result))
      return
    end
    if contains(response,"matplotlib")
      mimeType = "text/html"
      eval(:($(Expr(:using, symbol("PyPlot")))))
      figure = PyPlot.gcf()
      pygui(false) # after the fact - review
      println(stringmime("image/svg+xml",figure))
      return
    end
    if rstrip(statement)[end]!=';'
       mimeType="text/plain"
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
function helpcode(code::AbstractString)
    if VERSION < v"0.4.0-dev+2891" # old Base.@help macro
        return "Base.@help " * code
    else # new Base.Docs.@repl macro from julia@08663d4bb05c5b8805a57f46f4feacb07c7f2564
        code_ = strip(code)
        # as in base/REPL.jl, special-case keywords so that they parse
        if(haskey(Docs.keywords, symbol(code_)))
          return "eval(:(Base.Docs.@repl \$(symbol(\"$code_\"))))"
        else
          return "Base.Docs.@repl $code_"
        end
    end
end
end

