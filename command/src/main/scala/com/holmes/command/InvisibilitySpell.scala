package com.holmes.command

/**
  * Created by denny.lao on 2017/2/17.
  *
  * InvisibilitySpell is a concrete command
  */
class InvisibilitySpell extends Command {
  private var target: Target = null

  override def execute(target: Target): Unit = {
    target.visibility = Visibility.INVISIBLE
    this.target = target
  }

  override def undo: Unit = {
    if(target != null){
      target.visibility = Visibility.VISIBLE
    }
  }

  override def redo: Unit = {
    if(target != null){
      target.visibility = Visibility.INVISIBLE
    }
  }

  override def toString: String = "Invisibility spell"
}