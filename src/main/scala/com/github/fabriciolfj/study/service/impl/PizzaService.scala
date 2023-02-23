package com.github.fabriciolfj.study.service.impl

import com.github.fabriciolfj.study.enums.Topping
import com.github.fabriciolfj.study.models.Pizza
import com.github.fabriciolfj.study.service.PizzaServiceInterface

trait PizzaService extends PizzaServiceInterface:

  //override def addTopping(p: Pizza, t: Topping) : Pizza =
    //val newToppings = p.toppings :+ t
    //p.copy(toppings = newToppings)

end PizzaService