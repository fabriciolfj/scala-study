package com.github.fabriciolfj.study.traits_exemplos.modules.module2

import CrustSize.*
import CrustType.*
import Topping.*

@main def execute() : Unit = {

  object MockOrderDao extends MockOrderDao
  object MockOrderController extends OrderController, ConsoleLogger {
      val orderDao = MockOrderDao
  }

  val small = Pizza(Small, Thin, Seq(Cheese))
  val large = Pizza(Large, Thick, Seq(Cheese, Pepperoni, Olives))

  MockOrderController.addItemToOrder(small)
  MockOrderController.addItemToOrder(large)

  MockOrderController.printReceipt()
}
