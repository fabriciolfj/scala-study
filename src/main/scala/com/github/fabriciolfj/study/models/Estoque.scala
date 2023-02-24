package com.github.fabriciolfj.study.models

case class Estoque(val quantidade: Int = 0) :
  println("inicio construtor")
  
  def exibir() : Unit = {
    println(s"$quantidade")
  }
  
  println("fim construtor")
