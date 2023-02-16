package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeLoopEstruturasDeDadosFor() : Unit = {
  //forBasic()
  forBasicIf()

  val result = 0 to 10
  for i <- result do print(i)
}

def forBasic() : Unit = {
  for i <- List(1, 2, 3) do println(i)
}

def forBasicIf() : Unit = {
  val result = for i <- 1 to 10
                if i > 3
                if i < 6
              //do println(i)
              yield
                i * 10

  println(result)
}
