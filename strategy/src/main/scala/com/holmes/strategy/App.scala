package com.holmes.strategy

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/21.
  *
  * The Strategy pattern (also known as the policy pattern) is a software design pattern that enables
  * and algorithm's behavior to be selected at runtime.
  * <p>
  * Before Java 8 the Strategies needed to be separate classes forcing the developer
  * to write lots of boilerplate code. With modern Java it is easy to pass behavior
  * with method references and lambdas making the code shorter and more readable.
  * <p>
  * In this example ({@link DragonSlayingStrategy}) encapsulates an algorithm. The containing object
  * ({@link DragonSlayer}) can alter its behavior by changing its strategy.
  *
  */
object App {
  val LOGGER = LoggerFactory.getLogger(classOf[App])

  def main(args: Array[String]): Unit = {
    LOGGER.info("Green dragon spotted ahead!")
    val dragonSlayer = new DragonSlayer(new MeleeStrategy())
    dragonSlayer.goToBattle
    LOGGER.info("Red dragon emerges.")
    dragonSlayer.changeStrategy(new ProjectileStrategy)
    dragonSlayer.goToBattle
    LOGGER.info("Black dragon lands before you.")
    dragonSlayer.changeStrategy(new SpellStrategy)
    dragonSlayer.goToBattle
  }
}