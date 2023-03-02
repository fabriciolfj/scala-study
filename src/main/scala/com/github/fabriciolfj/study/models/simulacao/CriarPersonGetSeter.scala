package com.github.fabriciolfj.study.models.simulacao

import com.github.fabriciolfj.study.models.PersonGetSeter

@main def executeCriarPersonGetSeter() : Unit = {
  var person = PersonGetSeter("fabricio")
  person.name = "teste"
  
  println(person.name)
}
