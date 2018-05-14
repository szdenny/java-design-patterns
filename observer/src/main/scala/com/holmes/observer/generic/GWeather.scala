package com.holmes.observer.generic

import com.holmes.observer.WeatherType
import com.holmes.observer.WeatherType.WeatherType
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/3/9.
  */
class GWeather extends Observable[GWeather, Race, WeatherType.WeatherType] {
  private var currentWeather: WeatherType = WeatherType.SUNNY

  def timePasses(): Unit = {
    currentWeather = WeatherType((currentWeather.id + 1) % WeatherType.maxId)
    GWeather.LOGGER.info("The weather changed to {}.", currentWeather)
    notifyObservers(currentWeather)
  }
}

object GWeather {
  private val LOGGER = LoggerFactory.getLogger(classOf[GWeather])
}
