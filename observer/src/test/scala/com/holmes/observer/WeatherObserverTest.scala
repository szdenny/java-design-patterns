package com.holmes.observer

import com.holmes.observer.WeatherType.WeatherType
import com.holmes.observer.utils.InMemoryAppender
import org.junit.Assert._
import org.junit.{After, Before, Test}

/**
  * Created by denny.lao on 2017/3/10.
  */
abstract class WeatherObserverTest[O <: WeatherObserver](private val weather: WeatherType, private val response: String, private val factory: () => O) {
  private var appender: InMemoryAppender = null

  @Before def setUp = appender = new InMemoryAppender()

  @After def tearDown = appender.stop()


  @Test def testObserver: Unit = {
    val observer = factory()
    assertEquals(0, appender.getLogSize())

    observer.update(this.weather)
    assertEquals(response, appender.getLastMessage())
    assertEquals(1, appender.getLogSize())
  }
}
