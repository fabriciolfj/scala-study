package com.github.fabriciolfj.study.traits_exemplos.mixin

class Pet(val name: String) {

}

@main def executeMixin() : Unit = {
  val zeus = new Pet("Zeus") with MansBestFriend with HasTail with HasLegs
}