package com.github.fabriciolfj.study.numeros

import java.text.{DecimalFormat, NumberFormat}
import java.util.{Currency, Locale}

@main def executeFormatNumber() : Unit = {
  val locale = Currency.getInstance(Locale("pt-BR", "BR"))
  val formatter = NumberFormat.getCurrencyInstance()
  formatter.setCurrency(locale)

  println(formatter.format(1_000))

  val df = DecimalFormat("0.##")
  println(df.format(122.92))

}
