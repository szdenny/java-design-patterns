package com.holmes.templatemethod

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/22.
  *
  * SubtleMethod implementation of {@link StealingMethod}
  */
class SubtleMethod extends StealingMethod {
  override protected def pickTarget: String = "shop keeper"

  override protected def confuseTarget(target: String): Unit = SubtleMethod.LOGGER.info("Approach the {} with tears running and hug him!", target)

  override protected def stealTheItem(target: String): Unit = SubtleMethod.LOGGER.info("While in close contact grab the {}'s wallet.", target)
}

object SubtleMethod {
  private val LOGGER = LoggerFactory.getLogger(classOf[SubtleMethod])
}