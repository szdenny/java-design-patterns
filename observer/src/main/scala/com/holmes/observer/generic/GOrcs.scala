package com.holmes.observer.generic
import com.holmes.observer.WeatherType._
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/3/10.
  */
class GOrcs extends Race{
  override def update(subject: GWeather, argument: WeatherType): Unit = {
    argument match{
      case COLD => GOrcs.LOGGER.info("The orcs are freezing cold.")
      case RAINY => GOrcs.LOGGER.info("The orcs are dripping wet.")
      case SUNNY => GOrcs.LOGGER.info("The sun hurts the orcs' eyes.")
      case WINDY => GOrcs.LOGGER.info("The orc smell almost vanishes in the wind.")
    }
  }
}

object GOrcs{
  private val LOGGER = LoggerFactory.getLogger(classOf[GOrcs])
}
