package com.holmes.strategy

import java.util
import java.util._

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import org.junit.Assert._
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.junit.{After, Before, Test}
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/22.
  */
@RunWith(classOf[Parameterized])
class DragonSlayingStrategyTest(val strategy: DragonSlayingStrategy, val expectedResult: String) {
  private var appender: InMemoryAppender = null

  @Before def setUp: Unit = {
    appender = new InMemoryAppender
  }

  @After def tearDown: Unit = {
    appender.stop
  }

  @Test def testExecute: Unit = {
    strategy.execute
    assertEquals(expectedResult, appender.getLastMessage)
    assertEquals(1, appender.getLogSize)
  }

  private class InMemoryAppender extends AppenderBase[ILoggingEvent] {
    val log = new LinkedList[ILoggingEvent]()

    LoggerFactory.getLogger("root").asInstanceOf[Logger].addAppender(this)
    start()

    override def append(eventObject: ILoggingEvent): Unit = {
      log.add(eventObject)
    }

    def getLogSize = log.size()

    def getLastMessage = log.get(log.size() - 1).getFormattedMessage
  }

}

object DragonSlayingStrategyTest {
  @Parameters
  def parameters(): java.util.Collection[Array[java.lang.Object]] = {
    val data = Array(
      Array(new MeleeStrategy, "With your Excalibur you server the dragon's head!"),
      Array(new ProjectileStrategy, "You shoot the dragon with the magical crossbow and it falls dead on the ground!"),
      Array(new SpellStrategy, "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!")
    )
    val list = new util.ArrayList[Array[java.lang.Object]]()

    data.foreach(o => list.add(o))
    list
  }
}