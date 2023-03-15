package com.github.fabriciolfj.study.programacaofuncional.example3

@main def execute(): Unit = {
  val v = () => println("hello")
  process(v)
  process(hello)
}

def process(f:() => Unit) = f()

def hello() = println("hello")
