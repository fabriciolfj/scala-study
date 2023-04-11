package com.github.fabriciolfj.study.colecoes.ordenacao

class PersonV2(val name: String) extends Ordered[PersonV2] {

  override def compare(that: PersonV2): Int = {
    if this.name == that.name then
      0
    else if this.name > that.name then
      1
    else
      -1
  }

  override def toString: String = s"$name"
}
