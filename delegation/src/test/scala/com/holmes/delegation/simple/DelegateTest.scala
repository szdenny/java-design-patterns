package com.holmes.delegation.simple

import java.util._

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import com.holmes.delegation.simple.printers.{CanonPrinter, EpsonPrinter, HpPrinter}
import org.junit.Assert._
import org.junit.{After, Before, Test}
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/15.
  */
class DelegateTest {
  private var appender: InMemoryAppender = null

  @Before def setUp: Unit = {
    appender = new InMemoryAppender
  }

  @After def tearDown: Unit = {
    appender.stop
  }

  @Test def testCanonPrinter: Unit = {
    val printerController = new PrinterController(new CanonPrinter)
    printerController.print(DelegateTest.MESSAGE)

    assertEquals("Canon Printer : Test Message Printed", appender.getLastMessage)
  }

  @Test def testHpPrinter: Unit = {
    val printerController = new PrinterController(new HpPrinter)
    printerController.print(DelegateTest.MESSAGE)

    assertEquals("HP Printer : Test Message Printed", appender.getLastMessage)
  }

  @Test def testEpsonPrinter: Unit = {
    val printerController = new PrinterController(new EpsonPrinter)
    printerController.print(DelegateTest.MESSAGE)

    assertEquals("Epson Printer : Test Message Printed", appender.getLastMessage)
  }

  private class InMemoryAppender extends AppenderBase[ILoggingEvent] {
    val log: List[ILoggingEvent] = new LinkedList()

    LoggerFactory.getLogger("root").asInstanceOf[Logger].addAppender(this)
    start()

    override def append(eventObject: ILoggingEvent): Unit = {
      log.add(eventObject)
    }

    def getLastMessage = log.get(log.size - 1).getFormattedMessage

    def getLogSize = log.size
  }

}

object DelegateTest {
  val MESSAGE = "Test Message Printed"
}
