package com.holmes.observer.generic

import com.holmes.observer.utils.InMemoryAppender
import org.junit.{After, Before, Test}

import org.mockito.Mockito._
/**
  * Created by denny.lao on 2017/3/10.
  */
class GWeatherTest {
  private var appender: InMemoryAppender = null

  @Before def setUp() = appender = new InMemoryAppender()

  @After def tearDown() = appender.stop()

  @Test def testAddRemoveObserver(): Unit ={
    val observer = mock(classOf[Race])
  }
}
