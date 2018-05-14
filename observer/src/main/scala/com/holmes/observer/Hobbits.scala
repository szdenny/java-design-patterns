package com.holmes.observer

import com.holmes.observer.WeatherType.WeatherType
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/3/9.
  */
class Hobbits extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = {
    currentWeather match {
      case WeatherType.COLD => Hobbits.LOGGER.info("The hobbits are shivering in the cold weather.")
      case WeatherType.RAINY => Hobbits.LOGGER.info("The hobbits look for cover from the rain.")
      case WeatherType.SUNNY => Hobbits.LOGGER.info("The happy hobbits bade in the warm sun.")
      case WeatherType.WINDY => Hobbits.LOGGER.info("The hobbits hold their hats tightly in the windy weather.")
    }
  }
}

object Hobbits {
  private val LOGGER = LoggerFactory.getLogger(classOf[Hobbits])
}
