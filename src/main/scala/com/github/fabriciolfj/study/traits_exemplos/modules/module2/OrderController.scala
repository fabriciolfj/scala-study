package com.github.fabriciolfj.study.traits_exemplos.modules.module2

trait OrderController {
  this: Logger =>
  def orderDao: OrderDao

  def addItemToOrder(p: Pizza) = orderDao.addItem(p)
  def printReceipt(): Unit =
    val receipt = generateReceipt
    println(receipt)
    log(receipt)

  private def generateReceipt: String =
    val items: Seq[Pizza] = for p <- orderDao.getItems yield  p
    s"""
         |YOU ORDER
         |_________
         |${items.mkString("\n")}
         |""".stripMargin

}
