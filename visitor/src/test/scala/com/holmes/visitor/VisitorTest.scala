package com.holmes.visitor

import java.util
import java.util.Optional

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import org.junit.Assert._
import org.junit.{After, Before, Test}
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/23.
  */
abstract class VisitorTest[V <: UnitVisitor](private val visitor: V, private val commanderResponse: Optional[String],
                                             private val sergeantResponse: Optional[String], private val soldierResponse: Optional[String]) {

  private var appender: InMemoryAppender = null

  @Before def setUp = appender = new InMemoryAppender

  @After def tearDown = appender.stop

  @Test def testVisitCommander: Unit = {
    visitor.visitCommander(new Commander())

    if (commanderResponse.isPresent) {
      assertEquals(commanderResponse.get(), appender.getLastMessage)
      assertEquals(1, appender.getLogSize)
    }
  }

  @Test def testVisitSergeant: Unit = {
    visitor.visitSergeant(new Sergeant())

    if (sergeantResponse.isPresent) {
      assertEquals(sergeantResponse.get(), appender.getLastMessage)
      assertEquals(1, appender.getLogSize)
    }
  }

  @Test def testVisitSoldier: Unit = {
    visitor.visitSoldier(new Soldier())

    if (soldierResponse.isPresent) {
      assertEquals(soldierResponse.get(), appender.getLastMessage)
      assertEquals(1, appender.getLogSize)
    }
  }

  private class InMemoryAppender extends AppenderBase[ILoggingEvent] {
    private val log = new util.LinkedList[ILoggingEvent]

    LoggerFactory.getLogger("root").asInstanceOf[Logger].addAppender(this)
    start()

    override protected def append(eventObject: ILoggingEvent): Unit = {
      log.add(eventObject)
    }

    def getLogSize = log.size()

    def getLastMessage = log.get(log.size - 1).getFormattedMessage
  }

}
