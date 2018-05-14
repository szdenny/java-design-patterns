package com.holmes.command

/**
  * Created by denny.lao on 2017/2/17.
  *
  * Goblin is the target of the spells
  */
class Goblin extends Target{
  size = Size.NORMAL
  visibility = Visibility.VISIBLE

  override def toString: String = "Goblin"
}
