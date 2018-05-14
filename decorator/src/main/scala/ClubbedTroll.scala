package com.holmes.decorator

import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by denny.lao on 2017/2/13.
  */
class ClubbedTroll(decorated:Troll) extends TrollDecorator(decorated:Troll){
  override def attack(): Unit = {
    super.attack()
    ClubbedTroll.LOGGER.info("The troll swings at you with a club!")
  }

  override def getAttackPower(): Int = super.getAttackPower()+10
}

object ClubbedTroll{
  val LOGGER:Logger = LoggerFactory.getLogger(classOf[ClubbedTroll])
}