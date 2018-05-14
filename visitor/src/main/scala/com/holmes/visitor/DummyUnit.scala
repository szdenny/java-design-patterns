package com.holmes.visitor

/**
  * Created by denny.lao on 2017/2/23.
  */
abstract class DummyUnit(private val children: DummyUnit*) {
  def accept(visitor: UnitVisitor): Unit = {
    children.foreach(child => child.accept(visitor))
  }
}
