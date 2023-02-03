package com.github.fabriciolfj.study.strings

@main def executeSubsString() : Unit = {

  val regex = "[0-9]+".r

  val msg = "123 hello casa cidade 118"

  var result = regex.replaceFirstIn(msg, "xxx")
  println(s"$result")

  result = regex.replaceAllIn(msg, "xxx");
  println(s"$result")
}
