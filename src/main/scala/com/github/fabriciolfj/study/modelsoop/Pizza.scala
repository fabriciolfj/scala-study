package com.github.fabriciolfj.study.modelsoop

import com.github.fabriciolfj.study.enums.{CrustSize, CrustType, Topping}

import scala.collection.mutable.ArrayBuffer

class Pizza(
             var crustSize: CrustSize,
             var crustType: CrustType,
             val toppings: ArrayBuffer[Topping]) extends Product {

  def addTopping(t: Topping): Unit =
    toppings += t

  def removeTopping(t: Topping): Unit =
    toppings -= t

  def removeAllToppings(): Unit =
    toppings.clear()

}