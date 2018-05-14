package com.holmes.command

import java.util

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/17.
  *
  * Wizard is the invoker of the commands.
  */
class Wizard {
  private val undoStack = new util.LinkedList[Command]()
  private val redoStack = new util.LinkedList[Command]()

  def castSpell(command: Command, target: Target): Unit = {
    Wizard.LOGGER.info("{} casts {} at {}", this, command, target)
    command.execute(target)
    undoStack.offerLast(command)
  }

  def undoLastSpell: Unit = {
    if (!undoStack.isEmpty) {
      val previousSpell = undoStack.pollLast
      redoStack.offerLast(previousSpell)
      Wizard.LOGGER.info("{} undoes {}", this.asInstanceOf[Any], previousSpell.asInstanceOf[Any])
      previousSpell.undo
    }
  }

  def redoLastSpell: Unit = {
    if (!redoStack.isEmpty) {
      val previousSpell = redoStack.pollLast
      undoStack.offerLast(previousSpell)
      Wizard.LOGGER.info("{} redoes {}", this.asInstanceOf[Any], previousSpell.asInstanceOf[Any])
      previousSpell.redo
    }
  }

  override def toString: String = "Wizard"
}

object Wizard {
  val LOGGER = LoggerFactory.getLogger(classOf[Wizard])
}