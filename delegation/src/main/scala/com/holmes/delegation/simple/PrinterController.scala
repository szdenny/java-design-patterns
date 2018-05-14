package com.holmes.delegation.simple

/**
  * Created by denny.lao on 2017/2/15.
  */
class PrinterController(printer: Printer) extends Printer {

  /**
    * This method is implemented from {@link Printer} however instead on providing an
    * implementation, it instead calls upon the class passed through the constructor. This is the delegate,
    * hence the pattern. Therefore meaning that the caller does not care of the implementing class only the owning
    * controller.
    *
    * @param message
    */
  override def print(message: String): Unit = printer.print(message)
}
