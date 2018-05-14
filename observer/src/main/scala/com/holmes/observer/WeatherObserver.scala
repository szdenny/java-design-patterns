package com.holmes.observer

import com.holmes.observer.WeatherType.WeatherType

/**
  * Created by denny.lao on 2017/3/9.
  */
trait WeatherObserver {
  def update(currentWeather: WeatherType)
}
