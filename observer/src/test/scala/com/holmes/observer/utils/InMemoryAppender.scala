package com.holmes.observer.utils

import java.util.{LinkedList, List}

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/14.
  */
class InMemoryAppender(clazz: Class[_]) extends AppenderBase[ILoggingEvent] {
  val log: List[ILoggingEvent] = new LinkedList

  def this() = {
    this(null)
  }

  if (clazz == null) {
    LoggerFactory.getLogger("root").asInstanceOf[Logger].addAppender(this)
  }
  else {
    LoggerFactory.getLogger(clazz).asInstanceOf[Logger].addAppender(this)
  }
  start

  override def append(eventObject: ILoggingEvent): Unit = {
    log.add(eventObject)
  }

  def logContains(message: String): Boolean = {
    log.stream.anyMatch((event: ILoggingEvent) => event.getFormattedMessage.equals(message))
  }

  def getLogSize(): Int = log.size

  def getLastMessage(): String = log.get(log.size() - 1).getFormattedMessage()
}
