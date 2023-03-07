package com.github.fabriciolfj.study.traits_exemplos.modules.module2

trait OrderDao {
  def addItem(p: Pizza) : Unit
  def getItems: Seq[Pizza]
}
