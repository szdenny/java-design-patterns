package com.holmes.delegation.simple.printers


import com.holmes.delegation.simple.Printer
import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by denny.lao on 2017/2/15.
  */
class CanonPrinter extends Printer {
  override def print(message: String): Unit = {
    CanonPrinter.LOGGER.info("Canon Printer : {}", message)
  }
}

object CanonPrinter {
  val LOGGER: Logger = LoggerFactory.getLogger(classOf[CanonPrinter])
}