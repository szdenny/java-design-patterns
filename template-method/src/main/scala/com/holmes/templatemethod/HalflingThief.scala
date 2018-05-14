package com.holmes.templatemethod

/**
  * Created by denny.lao on 2017/2/22.
  */
class HalflingThief(private var method: StealingMethod) {
  def steal = method.steal

  def changeMethod(method: StealingMethod): Unit = {
    this.method = method
  }
}
