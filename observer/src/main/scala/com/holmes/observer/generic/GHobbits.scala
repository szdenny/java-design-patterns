package com.holmes.observer.generic
import com.holmes.observer.WeatherType._
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/3/10.
  */
class GHobbits extends Race{
  override def update(subject: GWeather, argument: WeatherType): Unit = {
    argument match{
      case COLD => GHobbits.LOGGER.info("The hobbits are shivering in the cold weather.")
      case RAINY => GHobbits.LOGGER.info("The hobbits look for cover from the rain.")
      case SUNNY => GHobbits.LOGGER.info("The happy hobbits bad in the warm sun.")
      case WINDY => GHobbits.LOGGER.info("The hobbits hold their hats tightly in the windy weather.")
    }
  }
}

object GHobbits{
  private val LOGGER = LoggerFactory.getLogger(classOf[GHobbits])
}
