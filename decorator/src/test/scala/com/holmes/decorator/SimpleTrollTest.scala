package com.holmes.decorator

import java.util._

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import org.junit.Assert.assertEquals
import org.junit.{After, Before, Test}
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/13.
  */
class SimpleTrollTest {
  var appender: InMemoryAppender = _

  @Before def setUp(): Unit = {
    appender = new InMemoryAppender(classOf[SimpleTroll])
  }

  @After def tearDown(): Unit = {
    appender.stop
  }

  @Test def testTrollActions(): Unit = {
    val troll: SimpleTroll = new SimpleTroll
    assertEquals(10, troll.getAttackPower)

    troll.attack
    assertEquals("The troll tries to grab you!", appender.getLastMessage)

    troll.fleeBattle
    assertEquals("The troll shrieks in horror and runs away!", appender.getLastMessage)

    assertEquals(2, appender.getLogSize)
  }


  class InMemoryAppender extends AppenderBase[ILoggingEvent] {
    val log: List[ILoggingEvent] = new LinkedList();

    def this(clazz: Class[_]) = {
      this
      LoggerFactory.getLogger(clazz).asInstanceOf[Logger].addAppender(this)
      start
    }

    override def append(eventObject: ILoggingEvent): Unit = log.add(eventObject)

    def getLastMessage: String = log.get(log.size - 1).getMessage

    def getLogSize: Int = log.size
  }

}