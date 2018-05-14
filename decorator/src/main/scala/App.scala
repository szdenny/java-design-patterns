package com.holmes.decorator

import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by denny.lao on 2017/2/13.
  */
object App {
  val LOGGER: Logger = LoggerFactory.getLogger(classOf[App])

  def main(args: Array[String]) {
    //simple troll
    LOGGER.info("A simple looking troll approaches.")
    val troll:Troll = new SimpleTroll
    troll.attack
    troll.fleeBattle
    LOGGER.info("Simple troll power {}.\n", troll.getAttackPower())

    //Change the behavior of the simple troll by adding a decorator
    LOGGER.info("A troll with huge club surprises you.")
    val clubbed:Troll = new ClubbedTroll(troll)
    clubbed.attack
    clubbed.fleeBattle
    LOGGER.info("Clubbed troll power {}\n", clubbed.getAttackPower())
  }
}
