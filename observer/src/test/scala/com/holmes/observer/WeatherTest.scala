package com.holmes.observer

import com.holmes.observer.utils.InMemoryAppender
import org.junit.Assert._
import org.junit.{After, Before, Test}
import org.mockito.Mockito
import org.mockito.Mockito._

/**
  * Created by denny.lao on 2017/3/10.
  */
class WeatherTest {
  private var appender: InMemoryAppender = null

  @Before def setUp = appender = new InMemoryAppender()

  @After def tearDown = appender.stop()

  @Test def testAddRemoveObserver(): Unit = {
    val observer = mock(classOf[WeatherObserver])
    val weather = new Weather()

    weather.addObserver(observer)
    verifyZeroInteractions(observer)

    weather.timePasses()
    assertEquals("The weather changed to rainy.", appender.getLastMessage())
    verify(observer).update(WeatherType.RAINY)

    weather.removeObserver(observer)
    weather.timePasses()
    assertEquals("The weather changed to windy.", appender.getLastMessage())

    verifyNoMoreInteractions(observer)
    assertEquals(2, appender.getLogSize())
  }

  @Test def testTimePasses(): Unit = {
    val observer = mock(classOf[WeatherObserver])
    val weather = new Weather()

    weather.addObserver(observer)

    val inOrder = Mockito.inOrder(observer)

    (1 to 20).foreach(i => {
      weather.timePasses()
      inOrder.verify(observer).update(WeatherType(i % WeatherType.maxId))
    })

    verifyNoMoreInteractions(observer)
  }
}
