package com.github.fabriciolfj.study.traits_exemplos.modules.module2

trait MockOrderDao extends OrderDao {
  import scala.collection.mutable.ArrayBuffer
  private val items = ArrayBuffer[Pizza]()
  
  def addItem(p: Pizza) = items += p
  def getItems: Seq[Pizza] = items.toSeq
}
