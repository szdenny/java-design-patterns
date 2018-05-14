package com.holmes.observer

import java.util.concurrent.CopyOnWriteArrayList

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/3/10.
  */
class Weather {
  private val observers = new CopyOnWriteArrayList[WeatherObserver]()
  private var currentWeather = WeatherType.SUNNY

  def addObserver(obs: WeatherObserver) = observers.add(obs)

  def removeObserver(obs: WeatherObserver) = observers.remove(obs)

  def timePasses(): Unit = {
    currentWeather = WeatherType((currentWeather.id + 1) % WeatherType.maxId)
    Weather.LOGGER.info("The weather changed to {}.", currentWeather)
    observers.forEach((obs) => obs.update(currentWeather))
  }
}

object Weather {
  private val LOGGER = LoggerFactory.getLogger(classOf[Weather])
}
