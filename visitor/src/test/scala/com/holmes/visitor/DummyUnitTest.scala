package com.holmes.visitor

import org.junit.Test
import org.mockito.Mockito.{mock, verify, verifyNoMoreInteractions}

/**
  * Created by denny.lao on 2017/2/23.
  */
abstract class DummyUnitTest[U <: DummyUnit](val factory: (DummyUnit *) => U) {
  @Test def testAccept: Unit = {
    val children = (1 to 5).map(_ => mock(classOf[DummyUnit])).toArray

    val unit = factory(children: _*)
    val visitor = mock(classOf[UnitVisitor])
    unit.accept(visitor)
    verifyVisit(unit, visitor)

    children.foreach(child => verify(child).accept(org.mockito.Matchers.eq(visitor)))

    verifyNoMoreInteractions(children: _*)
    verifyNoMoreInteractions(visitor)
  }

  /**
    * Verify if the correct visit method is called on the mock, depending on the tested instance
    *
    * @param unit          The tested unit instance
    * @param mockedVisitor The mocked { @link UnitVisitor} who should have gotten a visit by the unit
    */
  def verifyVisit(unit: U, mockedVisitor: UnitVisitor): Unit
}
