package com.holmes.strategy

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/21.
  *
  * Spell strategy.
  */
class SpellStrategy extends DragonSlayingStrategy {
  override def execute: Unit = SpellStrategy.LOGGER.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!")
}

object SpellStrategy {
  val LOGGER = LoggerFactory.getLogger(classOf[SpellStrategy])
}