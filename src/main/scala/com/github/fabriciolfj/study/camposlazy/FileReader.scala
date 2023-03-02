package com.github.fabriciolfj.study.camposlazy

import scala.io.Source

class FileReader(filename: String) {

  lazy val text =
    val fileContents =
      try
        Source.fromFile(filename).getLines().mkString
      catch
        case e: Exception => e.getMessage

    println(fileContents)
}

@main def executeClassFielText() : Unit = {
  //nao e executado o fileContents, mesmo fazendo parte do construtor, por causa da clausura lazy em text
  val reader = FileReader("/etc/password")

  println(reader.text)
}
