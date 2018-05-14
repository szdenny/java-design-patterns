package com.holmes.observer

/**
  * Created by denny.lao on 2017/3/9.
  */
object WeatherType extends Enumeration {
  type WeatherType = Value

  val SUNNY = Value("sunny")
  val RAINY = Value("rainy")
  val WINDY = Value("windy")
  val COLD = Value("cold")
}
