package com.github.fabriciolfj.study.metodos.varargstest

class Simulacao {

}

//pode ter apenas 1 varargs e tem que ser o ultimo
@main def printAll(strings: String*) = strings.foreach(println)

@main def execute() : Unit = {
  val fruits = List("apple", "banana", "cherry")
  printAll(fruits: _*)
}
