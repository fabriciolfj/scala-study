package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeMap() : Unit = {
  val names = Map(
    "firstName" -> "Robert",
    "lastName" -> "Goren"
  )

  for(k, v) <- names do println(s"$k - $v")
}
