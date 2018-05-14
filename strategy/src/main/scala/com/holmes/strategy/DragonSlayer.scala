package com.holmes.strategy

/**
  * Created by denny.lao on 2017/2/21.
  *
  * DragonSlayer uses different strategies to slay the dragon.
  */
class DragonSlayer(var strategy: DragonSlayingStrategy) {
  def changeStrategy(strategy: DragonSlayingStrategy): Unit = {
    this.strategy = strategy
  }

  def goToBattle: Unit = {
    strategy.execute
  }
}
