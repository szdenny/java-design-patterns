package com.holmes.strategy

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/20.
  *
  * Melee strategy
  */
class MeleeStrategy extends DragonSlayingStrategy{
  override def execute: Unit = MeleeStrategy.LOGGER.info("With your Excalibur you server the dragon's head!")
}

object MeleeStrategy{
  val LOGGER = LoggerFactory.getLogger(classOf[MeleeStrategy])
}