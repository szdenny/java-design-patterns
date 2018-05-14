package com.holmes.decorator

import org.slf4j.{Logger, LoggerFactory}

/**
  * Interface for trolls
  */
trait Troll {
  def attack()

  def getAttackPower(): Int

  def fleeBattle()
}

object SimpleTroll {
  val LOGGER:Logger = LoggerFactory.getLogger(classOf[SimpleTroll])
}

class SimpleTroll extends Troll{
  override def attack(): Unit = SimpleTroll.LOGGER.info("The troll tries to grab you!")

  override def getAttackPower() = 10

  override def fleeBattle(): Unit = SimpleTroll.LOGGER.info("The troll shrieks in horror and runs away!")
}
