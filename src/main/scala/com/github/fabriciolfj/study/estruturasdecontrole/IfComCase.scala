package com.github.fabriciolfj.study.estruturasdecontrole

import com.github.fabriciolfj.study.models.{Person, Stock}

@main def executeIfComCase() : Unit = {
  rangeExecute()
  combinadoDiferentesValores()
  usandoCaseClasses()
  speak()
}

def speak() : Unit = {
  val person = Person("Fred")
  person match
    //case Person(name) if name == "Fred" => println("Fred encontrado")
    case Person("Fred") => println("Fred encontrado")
    case Person(name) if name == "Robert" => println("Robert encontrado")
    case _ => println("Nenhum person encontrado")
}

def usandoCaseClasses() : Unit = {
  val stock = Stock("AAPL", BigDecimal(132.50))
  stock match
    case x if x.symbol == "AAPL" && x.price < 120 => println(s"Symbol encontrado ${x.symbol} price ${x.price} (120)")
    case x if x.symbol == "AAPL" && x.price > 130 => println(s"Symbol encontrado ${x.symbol} price ${x.price} (130)")
    case x if x.symbol == "XXX" && x.price > 150 => println(s"Symbol encontrado ${x.symbol} price ${x.price} (150)")
    case _ => println("Nada encontrado")
}

def rangeExecute() : Unit = {
  val i = 4
  i match
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case b if 10 to 19 contains b => println("10 - 19 range: " + b)
    case c if 20 to 29 contains c => println("20 - 29 range: " + c)
    case _ => println("Humm")
}

def combinadoDiferentesValores() : Unit = {
  val i = 2
  i match
    //case x if (x == 2 || x == 3) => println("Corresponde ao valor 2 ou 3")
    case x @(2|3) => println(s"o valor corresponde a 2 ou 3, value $x")
    case x if x == 1 => println(s"Corresponde ao valor $x")
    case _ => println("Valor nao corresponde a nenhuma condicao")
}
