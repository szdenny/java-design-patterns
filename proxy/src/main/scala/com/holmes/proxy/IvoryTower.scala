package com.holmes.proxy

import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by denny.lao on 2017/2/14.
  *
  * The object to be proxied.
  */
class IvoryTower extends WizardTower{
  override def enter(wizard: Wizard): Unit = IvoryTower.LOGGER.info("{} enters the tower.", wizard)
}

object  IvoryTower{
  val LOGGER:Logger = LoggerFactory.getLogger(classOf[IvoryTower])
}
