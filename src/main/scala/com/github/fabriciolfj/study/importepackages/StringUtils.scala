package com.github.fabriciolfj.study.importepackages

object StringUtils:
  def truncate(s: String, length: Int): String = s.take(length)
  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")