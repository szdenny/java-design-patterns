package com.holmes.delegation.simple.printers

import com.holmes.delegation.simple.Printer
import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by denny.lao on 2017/2/15.
  */
class EpsonPrinter extends Printer {
  override def print(message: String): Unit = {
    EpsonPrinter.LOGGER.info("Epson Printer : {}", message)
  }
}

object EpsonPrinter {
  val LOGGER: Logger = LoggerFactory.getLogger(classOf[EpsonPrinter])
}