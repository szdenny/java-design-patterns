package com.holmes.strategy

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/21.
  */
class ProjectileStrategy extends DragonSlayingStrategy {
  override def execute: Unit = ProjectileStrategy.LOGGER.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!")
}

object ProjectileStrategy {
  val LOGGER = LoggerFactory.getLogger(classOf[ProjectileStrategy])
}