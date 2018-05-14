package com.holmes.visitor

/**
  * Created by denny.lao on 2017/2/23.
  */
object App {
  def main(args: Array[String]): Unit = {
    val commander = new Commander(new Sergeant(new Soldier, new Soldier, new Soldier), new Sergeant(new Soldier, new Soldier, new Soldier))

    commander.accept(new SoldierVisitor)
    commander.accept(new SergeantVisitor)
    commander.accept(new CommanderVisitor)
  }
}
