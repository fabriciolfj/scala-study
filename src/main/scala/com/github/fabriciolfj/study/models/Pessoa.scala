package com.github.fabriciolfj.study.models

class Pessoa(var nome: String, var age: Int) {

  def canEqual(a: Any) = a.isInstanceOf[Pessoa]

  override def equals(obj: Any): Boolean =
    obj match
      case obj: Pessoa =>
        obj.canEqual(this) &&
          obj.nome == this.nome &&
          obj.age == this.age
      case _ => false


  override def hashCode(): Int = {
    val state = Seq(nome, age)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
