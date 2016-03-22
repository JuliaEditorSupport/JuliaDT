module EclipseREPL
import Gadfly
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
    if(status=="complete")
      result=include_string(statement)
      if result!=nothing
        if typeof(result)==Gadfly.Plot
           mimeType = "text/html"
           println(stringmime(mimeType,result))
        else
          println(result)
        end
      end
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
#    Libc.flush_cstdio()
    flush(STDOUT)
#    flush(STDERR)
end
#import Base.flush
#const StdioPipe = Base.PipeEndpoint
#function flush(io::StdioPipe)
#    invoke(flush, (supertype(StdioPipe),), io)
#    if io == STDOUT
#        oslibuv_flush()
#        send_stream("stdout")
#    elseif io == STDERR
#        oslibuv_flush()
#        send_stream("stderr")
#    end
#end
end;
