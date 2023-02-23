package com.github.fabriciolfj.study.modelsoop

import scala.collection.mutable.ArrayBuffer

class Order() :
  private var lineItems = ArrayBuffer[Product]()

  def addItem(p: Product): Unit = {
    lineItems.addOne(p)
  }

end Order
