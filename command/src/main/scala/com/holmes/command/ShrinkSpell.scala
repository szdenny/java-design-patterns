package com.holmes.command

import com.holmes.command.Size.Size

/**
  * Created by denny.lao on 2017/2/17.
  *
  * ShrinkSpell is a concrete command
  */
class ShrinkSpell extends Command {
  private var oldSize: Size = null
  private var target: Target = null

  override def execute(target: Target): Unit = {
    oldSize = target.size
    target.size = Size.SMALL
    this.target = target
  }

  override def undo: Unit = {
    if (oldSize != null && target != null) {
      val temp = target.size
      target.size = oldSize
      oldSize = temp
    }
  }

  override def redo: Unit = {
    undo
  }

  override def toString: String = "Shrink spell"
}
