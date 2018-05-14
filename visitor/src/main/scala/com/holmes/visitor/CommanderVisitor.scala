package com.holmes.visitor

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/23.
  */
class CommanderVisitor extends UnitVisitor {
  override def visitSoldier(soldier: Soldier): Unit = {
    //Do nothing
  }

  override def visitSergeant(sergeant: Sergeant): Unit = {
    //Do nothing
  }

  override def visitCommander(commander: Commander): Unit = {
    CommanderVisitor.LOGGER.info("Good to see you {}.", commander)
  }
}

object CommanderVisitor {
  private val LOGGER = LoggerFactory.getLogger(classOf[CommanderVisitor])
}
