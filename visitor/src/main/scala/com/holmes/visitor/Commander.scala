package com.holmes.visitor

/**
  * Created by denny.lao on 2017/2/23.
  */
class Commander(private val children: DummyUnit*) extends DummyUnit(children: _*) {
  override def accept(visitor: UnitVisitor): Unit = {
    visitor.visitCommander(this)
    super.accept(visitor)
  }

  override def toString: String = "commander"
}
