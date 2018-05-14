package com.holmes.decorator

import org.junit.Test

import org.junit.Assert._
import org.mockito.Mockito._

/**
  * Created by denny.lao on 2017/2/13.
  */
class ClubbedTrollTest {
  @Test def testSmartHostile(){
    //Create a normal troll first, but make sure we can spy on it later on.
    val simpleTroll : Troll = spy(new SimpleTroll())

    //Now we want to decorate the troll to make it stronger ...
    val clubbed : Troll = new ClubbedTroll(simpleTroll)
    assertEquals(20, clubbed.getAttackPower())
    verify(simpleTroll, times(1)).getAttackPower()

    //Check if the clubbed troll actions are delegated to the decorated troll
    clubbed.attack()
    verify(simpleTroll, times(1)).attack()

    clubbed.fleeBattle()
    verify(simpleTroll, times(1)).fleeBattle()
    verifyNoMoreInteractions(simpleTroll)
  }
}
