package com.github.fabriciolfj.study.strings

@main def executeFormatacao() : Unit = {
  val hello = "hello"

  println(f"'${hello}%s'")
  println(f"'${hello}%10s'")
  println(f"'${hello}%-10s'")

  val a  = 10.3456
  val b = 101234567.3456

  println(f"$a%.1f")
  println(f"$a%.2f")
  println(f"$a%8.2f")
  println(f"$a%-8.2f")
  println(f"$a%08.2f")

  val zero = 0
  val one = 1
  val negTen = -10
  val bigPos = 12345
  val bigNeg = -12345
  val maxInt = Int.MaxValue

  // non-negative integers
  println(f"${zero}%03d") // 000
  println(f"${one}%03d") // 001
  println(f"${bigPos}%03d") // 12345
  println(f"${bigPos}%08d") // 00012345
  println(f"${maxInt}%08d") // 2147483647
  println(f"${maxInt}%012d") // 002147483647

  println(f"${negTen}%03d") // -10
  println(f"${negTen}%05d") // -0010
  println(f"${bigNeg}%03d") // -12345
  println(f"${bigNeg}%08d") // -0012345

  val n = "Al"
  val w = 200.0
  val s =
    f"""Hi, my name is $n
       |and i weigh ${w}%.1f pounds.
       |""".stripMargin.replaceAll("\n", " ")

  println(s)
}
