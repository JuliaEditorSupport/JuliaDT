function execute(statement)
  expression = parse(statement,1; greedy=true, raise=false)
  if isa(expression[1],Expr)
    state = expression[1].head
  else
    state = nothing
  end
  status = state==:incomplete ? "<<incomplete>>" : state==:error ? "<<invalid>>" : "<<complete>>"
  println(status)
  if(status=="<<complete>>")
    println(include_string(statement))
  end
  println("<<eox>>")
end