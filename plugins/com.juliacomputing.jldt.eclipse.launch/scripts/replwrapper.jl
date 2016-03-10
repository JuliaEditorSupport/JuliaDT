function execute(statement)
  ast = parse(statement; raise=false)
  if isa(ast,Expr)
    state = ast.head
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