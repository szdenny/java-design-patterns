package com.holmes.command

import com.holmes.command.Visibility._
import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/17.
  *
  * Base class for spell targets.
  */
abstract class Target() {
  var size : Size.Size = null
  var visibility : Visibility = null

  def printStatus: Unit = {
    Target.LOGGER.info("{}, [size={}] [visibility={}]", this.asInstanceOf[Object], size.asInstanceOf[Object], visibility.asInstanceOf[Object])
  }

  def toString(): String
}

object Target {
  val LOGGER = LoggerFactory.getLogger(classOf[Target])
}
