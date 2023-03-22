package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.ListUtils.dropFirstMatch

trait PizzaServiceInterface {

  def addTopping(p: Pizza, t: Topping) : Pizza
  def removeTopping(p: Pizza, t: Topping) : Pizza
  def removeAllToppings(p: Pizza) : Pizza

  def updateCrustSize(p: Pizza, cs: CrustSize) : Pizza
  def updateCrustType(p: Pizza, ct: CrustType) : Pizza

}