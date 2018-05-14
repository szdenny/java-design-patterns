package com.holmes.command

/**
  * Created by denny.lao on 2017/2/17.
  */
object App {
  def main(args:Array[String]): Unit ={
    val wizard = new Wizard
    val goblin = new Goblin

    goblin.printStatus

    wizard.castSpell(new ShrinkSpell, goblin)
    goblin.printStatus

    wizard.castSpell(new InvisibilitySpell, goblin)
    goblin.printStatus

    wizard.undoLastSpell
    goblin.printStatus

    wizard.undoLastSpell
    goblin.printStatus

    wizard.redoLastSpell
    goblin.printStatus

    wizard.redoLastSpell
    goblin.printStatus
  }
}
