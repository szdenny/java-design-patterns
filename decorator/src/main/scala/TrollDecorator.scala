package com.holmes.decorator

/**
  * Created by denny.lao on 2017/2/13.
  */
class TrollDecorator(decorated:Troll) extends Troll{

  override def attack(): Unit = decorated.attack

  override def getAttackPower(): Int = decorated.getAttackPower()

  override def fleeBattle(): Unit = decorated.fleeBattle
}
