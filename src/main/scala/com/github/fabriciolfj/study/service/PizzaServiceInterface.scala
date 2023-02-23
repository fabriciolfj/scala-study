package com.github.fabriciolfj.study.service

import com.github.fabriciolfj.study.enums.Topping
import com.github.fabriciolfj.study.models.Pizza

trait PizzaServiceInterface {
  
  def addTopping(p: Pizza, t: Topping) : Pizza

}
