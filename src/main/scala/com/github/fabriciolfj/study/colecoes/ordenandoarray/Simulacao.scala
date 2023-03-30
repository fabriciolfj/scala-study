package com.github.fabriciolfj.study.colecoes.ordenandoarray

class Simulacao {

}

@main def execute() : Unit = {
  val peeps = Array(
    Person("Jessica", "Day"),
    Person("Nick", "Miller"),
    Person("Winston", "Bishop"),
    Person("", "Schmidt"),
    Person("Coach", ""),
  )

  import scala.util.Sorting.quickSort

  quickSort(peeps)

  peeps.foreach(n => println(n))
}
