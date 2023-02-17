package com.github.fabriciolfj.study.estruturasdecontrole

@main def execute() : Unit = {
  val fruits = List("apple", "banana", "orange")
  for f <- fruits do {
    val s = f.toUpperCase
    println(s)
  }

  //com contador
  for (f, index) <- fruits.zipWithIndex do println(s"$index é a fruta $f")
}
