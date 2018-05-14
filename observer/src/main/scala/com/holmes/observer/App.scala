package com.holmes.observer

/**
  * Created by denny.lao on 2017/3/10.
  */
object App {
  def main(args : Array[String]): Unit ={
    val weather = new Weather()
    weather.addObserver(new Orcs())
    weather.addObserver(new Hobbits())

    weather.timePasses()
  }
}
