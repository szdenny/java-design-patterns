package com.holmes.visitor

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/23.
  */
class SoldierVisitor extends UnitVisitor {
  override def visitSoldier(soldier: Soldier): Unit = {
    SoldierVisitor.LOGGER.info("Greetings {}", soldier)
  }

  override def visitSergeant(sergeant: Sergeant): Unit = {}

  override def visitCommander(commander: Commander): Unit = {}
}

object SoldierVisitor {
  val LOGGER = LoggerFactory.getLogger(classOf[SoldierVisitor])
}
