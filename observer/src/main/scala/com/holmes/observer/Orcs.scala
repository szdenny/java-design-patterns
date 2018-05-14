package com.holmes.observer

import com.holmes.observer.WeatherType.{COLD, RAINY, SUNNY, WINDY, WeatherType}
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/3/10.
  */
class Orcs extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = {
    currentWeather match {
      case COLD => Orcs.LOGGER.info("The orcs are freezing cold.")
      case RAINY => Orcs.LOGGER.info("The orcs are dripping wet.")
      case SUNNY => Orcs.LOGGER.info("The sun hurts the orcs' eyes.")
      case WINDY => Orcs.LOGGER.info("The orc smell almost vanishes in the wind.")
    }
  }
}

object Orcs {
  private val LOGGER = LoggerFactory.getLogger(classOf[Orcs])
}
