package com.github.fabriciolfj.study.traits_exemplos.restricaoextencaopormethod

class Enterprise extends WarpCore {
  def ejectWarpCore(password: String): Boolean =
    if password == "password" then
      println("ejecting core!")
      true
    else
      false
    end if

}
