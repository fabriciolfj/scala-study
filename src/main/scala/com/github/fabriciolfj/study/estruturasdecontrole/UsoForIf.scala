package com.github.fabriciolfj.study.estruturasdecontrole

@main def executeForIf() : Unit = {
  for i <- 0 to 10
    if i % 2 == 0
    if i > 4
  do
    println(s"$i")
}
