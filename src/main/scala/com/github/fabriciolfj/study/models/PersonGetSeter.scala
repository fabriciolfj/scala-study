package com.github.fabriciolfj.study.models

class PersonGetSeter(private var _name: String) {

  //geter
  def name  = _name

  //seter
  def name_= (aName: String) : Unit = _name = aName

}
