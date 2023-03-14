package com.github.fabriciolfj.study.importepackages

import StringUtils.*

@main def executeTest() : Unit = {
  truncate("four score and seven ", 4) // "four"
  leftTrim("  four score and  ") // "four score and  "
}