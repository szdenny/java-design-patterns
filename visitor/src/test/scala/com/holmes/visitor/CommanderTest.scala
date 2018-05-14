package com.holmes.visitor

import org.mockito.Mockito.verify

/**
  * Created by denny.lao on 2017/2/23.
  */
class CommanderTest extends DummyUnitTest[Commander]((a) => new Commander(a: _*)) {
  /**
    * Verify if the correct visit method is called on the mock, depending on the tested instance
    *
    * @param unit          The tested unit instance
    * @param mockedVisitor The mocked { @link UnitVisitor} who should have gotten a visit by the unit
    */
  override def verifyVisit(unit: Commander, mockedVisitor: UnitVisitor): Unit = {
    verify(mockedVisitor).visitCommander(org.mockito.Matchers.eq(unit))
  }
}
