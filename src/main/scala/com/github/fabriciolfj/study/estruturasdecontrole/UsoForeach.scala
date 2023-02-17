package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeForeach() : Unit = {
  val fruits = List("maca", "pera", "banana")

  fruits.foreach(println)

  fruits.foreach(e => println(e.toUpperCase()))

  fruits.foreach(e => {
    val s = e.toUpperCase()
    println(s)
  })
}