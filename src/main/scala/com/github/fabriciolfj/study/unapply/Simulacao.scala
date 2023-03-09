package com.github.fabriciolfj.study.unapply

class Simulacao {

}


@main def execute() : Unit = {
  val person = Person("fabricio",  38)

  val result = person match
    case Person(n, a) => s"name $n age $a"
    case null => "null"

  println(result)
}