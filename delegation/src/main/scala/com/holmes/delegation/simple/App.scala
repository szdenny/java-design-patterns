package com.holmes.delegation.simple

import com.holmes.delegation.simple.printers.{CanonPrinter, EpsonPrinter, HpPrinter}

/**
  * Created by denny.lao on 2017/2/15.
  */
object App {
  val MESSAGE_TO_PRINT = "hello world"

  def main(args: Array[String]): Unit = {
    val hpPrinterController: PrinterController = new PrinterController(new HpPrinter())
    val canonPrinterController: PrinterController = new PrinterController(new CanonPrinter())
    val epsonPrinterController: PrinterController = new PrinterController(new EpsonPrinter())

    hpPrinterController.print(MESSAGE_TO_PRINT)
    canonPrinterController.print(MESSAGE_TO_PRINT)
    epsonPrinterController.print(MESSAGE_TO_PRINT)
  }
}