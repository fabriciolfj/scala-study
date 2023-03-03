package com.github.fabriciolfj.study.traits_exemplos.restricaoextencaopormethod

trait WarpCore {
  this : { def ejectWarpCore(password: String) : Boolean } =>
}
