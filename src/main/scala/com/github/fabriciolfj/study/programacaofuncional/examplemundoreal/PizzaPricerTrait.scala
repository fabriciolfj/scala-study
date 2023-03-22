package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

trait PizzaPricerTrait {

  def pizzaDao: PizzaDaoInterface

  def calculatePizzaPrice(p: Pizza) : BigDecimal =
    val crustSizePrice: BigDecimal = pizzaDao.getCrustSizePrices()(p.crustSize)
    val crustTypePrice: BigDecimal = pizzaDao.getCrustTypePrices()(p.crustType)
    val toppingPrices: Seq[BigDecimal] =
      for
        topping <- p.toppings
        toppingPrice = pizzaDao.getToppingPrices()(topping)
      yield
        toppingPrice
    val totalToppingPrice: BigDecimal = toppingPrices.reduce(_ + _)
    val totalPrice: BigDecimal = crustTypePrice + crustSizePrice + totalToppingPrice
    totalPrice
}
