package com.github.fabriciolfj.study.models

import com.github.fabriciolfj.study.models.Pizza
import com.github.fabriciolfj.study.enums.{Customer}

case class Order(pizzas: Seq[Pizza], customer: Customer)
