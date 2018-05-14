package com.holmes.templatemethod

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/22.
  */
class HitAndRunMethod extends StealingMethod {
  override protected def pickTarget: String = "old goblin woman"

  override protected def confuseTarget(target: String): Unit = {
    HitAndRunMethod.LOGGER.info("Approach the {} from behind.", target)
  }

  override protected def stealTheItem(target: String): Unit = {
    HitAndRunMethod.LOGGER.info("Grab the handbag and run away fast!")
  }
}

object HitAndRunMethod {
  private val LOGGER = LoggerFactory.getLogger(classOf[HitAndRunMethod])
}
