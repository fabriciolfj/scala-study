package com.github.fabriciolfj.study.programacaofuncional.examplemundoreal

trait PizzaDaoInterface {
  
  def getToppingPrices(): Map[Topping, BigDecimal]
  def getCrustSizePrices(): Map[CrustSize, BigDecimal]
  def getCrustTypePrices(): Map[CrustType, BigDecimal]

}
