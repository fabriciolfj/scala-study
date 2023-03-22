package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

enum Topping:
  case Cheese, Pepperoni, Sausage, Mushrooms, Onions

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Regular, Thin, Thick;

case class Pizza(
  crustSize: CrustSize,
  crustType: CrustType,
  toppings: Seq[Topping]
)