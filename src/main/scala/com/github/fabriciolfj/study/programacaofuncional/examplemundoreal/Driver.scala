package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.CrustType.Thick
import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.Topping.{Mushrooms, Pepperoni}
import Topping.*, CrustSize.*, CrustType.*

@main def pizzaServiceMain =
  import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.PizzaService
  object Service extends PizzaService

  val p = Pizza(Medium, Regular, Seq(Cheese))

  val p1 = Service.addTopping(p, Pepperoni)
  val p2 = Service.addTopping(p1, Mushrooms)
  val p3 = Service.updateCrustType(p2, Thick)
  val p4 = Service.updateCrustSize(p3, Large)
  val p5 = Service.removeTopping(p4, p4.toppings.apply(2))

  println(p5)