package com.github.fabriciolfj.study.strings

extension (sc: StringContext)
  def caps(args: Any*): String =
    val strings: Iterator[String] = sc.parts.iterator
    val expressions: Iterator[Any] = args.iterator

    val sb = StringBuilder(strings.next.trim)
    while strings.hasNext do
      sb.append(expressions.next.toString)
      sb.append(strings.next)

    sb.toString()
      .split(" ")
      .map(_.trim)
      .map(_.capitalize)
      .mkString(" ")
  end caps
end extension

