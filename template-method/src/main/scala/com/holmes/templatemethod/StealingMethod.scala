package com.holmes.templatemethod

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/22.
  *
  * StealingMethod defines skeleton for the algorithm.
  */
abstract class StealingMethod {
  protected def pickTarget: String

  protected def confuseTarget(target: String)

  protected def stealTheItem(target: String)

  def steal() = {
    val target = pickTarget

    StealingMethod.LOGGER.info("The target has been chosen as {}.", target)
    confuseTarget(target)
    stealTheItem(target)
  }
}

object StealingMethod {
  private val LOGGER = LoggerFactory.getLogger(classOf[StealingMethod])
}