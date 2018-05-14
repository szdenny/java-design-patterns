package com.holmes.delegation.simple.printers

import com.holmes.delegation.simple.Printer
import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by denny.lao on 2017/2/15.
  */
class HpPrinter extends Printer {
  override def print(message: String): Unit = {
    HpPrinter.LOGGER.info("HP Printer : {}", message)
  }

}

object HpPrinter {
  val LOGGER: Logger = LoggerFactory.getLogger(classOf[HpPrinter])
}