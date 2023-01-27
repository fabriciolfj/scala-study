package com.github.fabriciolfj.study.strings

@main def execute() : Unit = {
  val b = "b"
  val c = "b"
  val a = "a"
  val d = null

  println(b == a)
  println(b == c)
  println(a == d)

  val texto =
    """
      |teste fabricio
      |teste suzana
      |""".stripMargin


  println(texto)
}
