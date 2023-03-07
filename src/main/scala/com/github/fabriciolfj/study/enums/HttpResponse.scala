package com.github.fabriciolfj.study.enums

enum HttpResponse(val code: Int) {
  case OK extends HttpResponse(200)
  case MovedPermanently extends HttpResponse(301)
  case InternalServerError extends HttpResponse(500)
}

@main def execute() : Unit = {
  val http = HttpResponse.OK
  println(http.code)
}