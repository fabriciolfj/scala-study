package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal
import com.github.fabriciolfj.study.programacaofuncional.examplemundoreal.Topping.{Cheese, Onions, Mushrooms}
class PizzaPricingMain {

}

@main def executePricingMain() : Unit = {
  val p = Pizza(CrustSize.Large, CrustType.Regular, Seq(Cheese, Onions, Mushrooms))

  val total = DevPizzaPricerService.calculatePizzaPrice(p)

  println(total)
}
