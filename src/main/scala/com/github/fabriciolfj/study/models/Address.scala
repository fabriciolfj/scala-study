package com.github.fabriciolfj.study.models

case class Address(
                  street1: String,
                  street2: Option[String],
                  city: String,
                  state: String,
                  postalCode: String
                  )
