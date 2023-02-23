package com.github.fabriciolfj.study.models

import com.github.fabriciolfj.study.enums.{CrustSize, CrustType, Topping}

class Pizza(crustSize: CrustSize,
                 crustType: CrustType):

  def this(crustSize: CrustSize) = this(crustSize, Pizza.DefaultCrustType)

  def this(crustType: CrustType) = this(Pizza.DefaultCrustSize, crustType)

  def this() = this(Pizza.DefaultCrustSize, Pizza.DefaultCrustType)

  override def toString: String = s"A $crustSize pizza with a $crustType"

object Pizza:
  val DefaultCrustSize: CrustSize = CrustSize.Medium
  val DefaultCrustType: CrustType = CrustType.Regular