package com.holmes.observer

import com.holmes.observer.WeatherType.WeatherType
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

/**
  * Created by denny.lao on 2017/3/10.
  */
@RunWith(classOf[Parameterized])
class HobbitsTest(private val weather: WeatherType, private val response: String) extends WeatherObserverTest[Hobbits](weather, response, () => { new Hobbits }) {

}

object HobbitsTest {
  @Parameterized.Parameters def data() = {
    Array(
      Array(WeatherType.SUNNY, "The happy hobbits bade in the warm sun."),
      Array(WeatherType.RAINY, "The hobbits look for cover from the rain."),
      Array(WeatherType.WINDY, "The hobbits hold their hats tightly in the windy weather."),
      Array(WeatherType.COLD, "The hobbits are shivering in the cold weather.")
    )
  }
}
