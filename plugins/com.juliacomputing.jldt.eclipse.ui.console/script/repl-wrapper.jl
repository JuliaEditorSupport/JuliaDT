module EclipseREPL
function execute(statement)
  status="complete"
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
        println(result)
      end
    end
  catch e
    showerror(STDOUT, e); println()
    status = "error"
  finally
    flush(STDOUT)
    println("<<$status>>")
    println("<<eox>>")
  end
end
end;
