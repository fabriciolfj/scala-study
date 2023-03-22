package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.CrustSize.{Small, Medium, Large}
import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.CrustType.{Regular, Thick, Thin}
import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.Topping.{Mushrooms, Cheese, Pepperoni, Sausage, Onions}

object DevPizzaDao extends PizzaDaoInterface {

  override def getToppingPrices(): Map[Topping, BigDecimal] =
    Map(
      Cheese -> BigDecimal(1),
      Pepperoni -> BigDecimal(1),
      Sausage -> BigDecimal(1),
      Mushrooms -> BigDecimal(1),
      Onions -> BigDecimal(4)
    )

  override def getCrustSizePrices(): Map[CrustSize, BigDecimal] =
    Map(
      Small -> BigDecimal(0),
      Medium -> BigDecimal(1),
      Large -> BigDecimal(2)
    )

  override def getCrustTypePrices(): Map[CrustType, BigDecimal] =
    Map(
      Regular -> BigDecimal(0),
      Thick -> BigDecimal(1),
      Thin -> BigDecimal(1)
    )
}
