package com.github.fabriciolfj.study.colecoes.maps.operadores

class Basicos {

}

@main def execute() : Unit = {
  val map = collection.mutable.Map(
    1 -> "a",
    2 -> "b",
    3 -> "C",
    4 -> "D",
    5 -> "e",
    6 -> "f"
  )

  map.filterInPlace((k, v) => k > 3)

  println(map)

  var result = map.remove(1)
  println(result)

  result = map.put(6, "Z")
  println(result.get)

  println(map)
}
