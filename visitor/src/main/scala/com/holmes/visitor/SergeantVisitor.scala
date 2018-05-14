package com.holmes.visitor

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/23.
  */
class SergeantVisitor extends UnitVisitor {
  override def visitSoldier(soldier: Soldier): Unit = {
    //Do nothing
  }

  override def visitSergeant(sergeant: Sergeant): Unit = {
    SergeantVisitor.LOGGER.info("Hello {}.", sergeant)
  }

  override def visitCommander(commander: Commander): Unit = {
    //Do nothing
  }
}

object SergeantVisitor {
  private val LOGGER = LoggerFactory.getLogger(classOf[SergeantVisitor])
}
