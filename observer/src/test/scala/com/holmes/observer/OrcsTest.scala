package com.holmes.observer

import com.holmes.observer.WeatherType.WeatherType
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

/**
  * Created by denny.lao on 2017/3/10.
  */
@RunWith(classOf[Parameterized])
class OrcsTest(private val weather: WeatherType, private val response: String) extends WeatherObserverTest[Orcs](weather, response, () => {
  new Orcs()
}) {

}

object OrcsTest {
  @Parameterized.Parameters def data = Array(
    Array(WeatherType.SUNNY, "The sun hurts the orcs' eyes."),
    Array(WeatherType.RAINY, "The orcs are dripping wet."),
    Array(WeatherType.WINDY, "The orc smell almost vanishes in the wind."),
    Array(WeatherType.COLD, "The orcs are freezing cold.")
  )
}
