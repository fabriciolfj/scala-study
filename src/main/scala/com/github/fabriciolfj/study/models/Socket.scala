package com.github.fabriciolfj.study.models

class Socket(val timeout: Int = 1_000, val linger : Int = 2_000):
  override def toString = s"timeout: $timeout, linger: $linger"
