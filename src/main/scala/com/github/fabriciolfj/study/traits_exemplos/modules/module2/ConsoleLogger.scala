package com.github.fabriciolfj.study.traits_exemplos.modules.module2

trait ConsoleLogger extends Logger {
  def log(s: String) = println(s"LOG: $s")
}
