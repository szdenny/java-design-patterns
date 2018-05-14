package com.holmes.visitor

/**
  * Created by denny.lao on 2017/2/23.
  *
  * Visitor pattern defines mechanism to apply operations on nodes in hierarchy. New operations can
  * be added without altering the node interface.
  * <p>
  * In this example there is a unit hierarchy beginning from {@link Commander}. This hierarchy is
  * traversed by visitors. {@link SoldierVisitor} applies its operation on {@link Solider}s,
  * {@link SergeantVisitor} on {@link Sergeant}s and so on.
  */
class Soldier(private val children: DummyUnit*) extends DummyUnit(children: _*) {
  override def accept(visitor: UnitVisitor): Unit = {
    visitor.visitSoldier(this)
    super.accept(visitor)
  }

  override def toString: String = "soldier"
}
