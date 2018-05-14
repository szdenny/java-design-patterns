package com.holmes.strategy

import org.junit.Test
import org.mockito.Mockito._

/**
  * Created by denny.lao on 2017/2/22.
  */
class DragonSlayerTest {
  /**
    * Verify if the dragon slayer uses the strategy during battle
    */
  @Test def testGoToBattle: Unit = {
    val strategy = mock(classOf[DragonSlayingStrategy])
    val dragonSlayer = new DragonSlayer(strategy)

    dragonSlayer.goToBattle
    verify(strategy).execute
    verifyNoMoreInteractions(strategy)
  }

  /**
    * Verify if the dragon slayer uses the new strategy during battle after a change of strategy
    */
  @Test def testChangeStrategy: Unit ={
    val initialStrategy = mock(classOf[DragonSlayingStrategy])
    val dragonSlayer = new DragonSlayer(initialStrategy)

    dragonSlayer.goToBattle
    verify(initialStrategy).execute

    val newStrategy = mock(classOf[DragonSlayingStrategy])
    dragonSlayer.changeStrategy(newStrategy)

    dragonSlayer.goToBattle
    verify(newStrategy).execute

    verifyNoMoreInteractions(initialStrategy, newStrategy)
  }
}