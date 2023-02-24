package com.github.fabriciolfj.study.models

class Cliente(var _nome: String, var _age: Int, var role: String) extends Pessoa(_nome, _age) {

  override def canEqual(a: Any): Boolean = a.isInstanceOf[Cliente]

  override def equals(obj: Any): Boolean =
    obj match
      case obj: Cliente =>
        obj.canEqual(this) &&
          obj.role == this.role &&
          super.equals(obj)
      case _ => false

  override def hashCode(): Int = {
    val state = Seq(super.hashCode(), _nome, _age, role)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
