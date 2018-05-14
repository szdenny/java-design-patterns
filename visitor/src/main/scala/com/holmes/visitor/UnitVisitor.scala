package com.holmes.visitor

/**
  * Created by denny.lao on 2017/2/23.
  */
trait UnitVisitor {
  def visitSoldier(soldier: Soldier)

  def visitSergeant(sergeant: Sergeant)

  def visitCommander(commander: Commander)
}
