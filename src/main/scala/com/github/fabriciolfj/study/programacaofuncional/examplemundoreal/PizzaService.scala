package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.ListUtils.dropFirstMatch

trait PizzaService extends PizzaServiceInterface:
  override def addTopping(p: Pizza, t: Topping): Pizza =
    val newToppings = p.toppings :+ t
    p.copy(toppings = newToppings)

  override def removeTopping(p: Pizza, t: Topping): Pizza =
    val newToppings = dropFirstMatch(p.toppings, t)
    p.copy(toppings = newToppings)

  override def removeAllToppings(p: Pizza): Pizza =
    val newToppings = Seq[Topping]()
    p.copy(toppings = newToppings)

  override def updateCrustSize(p: Pizza, cs: CrustSize): Pizza =
    p.copy(crustSize = cs)

  override def updateCrustType(p: Pizza, ct: CrustType): Pizza = 
    p.copy(crustType = ct)  
