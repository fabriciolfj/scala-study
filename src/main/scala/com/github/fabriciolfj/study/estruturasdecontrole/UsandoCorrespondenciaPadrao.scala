package com.github.fabriciolfj.study.estruturasdecontrole

import com.github.fabriciolfj.study.models.Person

@main def usandoCorrespondenciaPadrao() : Unit = {
  println(matchType(List(1, 2, 3)))
  println(matchType(Person("fabricio")))
  println(matchType(Some("foo")))
}

def matchType(x: Matchable) : String = x match
  case x @ List(1, _*) => s"$x" //vincula ao match dado, e posso utilizar (@)
  case x @ Some(_) => s"$x"
  case p @ Person("fabricio") => s"$p"

end matchType
