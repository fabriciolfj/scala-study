package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

object ListUtils {

  def dropFirstMatch[A](xs: Seq[A], value: A): Seq[A] = {
    val idx = xs.indexOf(value)
    val v = for (x, i) <- xs.zipWithIndex
        if i != idx
    yield
      println(x)
      x

    println(v)
    v
  }

}
