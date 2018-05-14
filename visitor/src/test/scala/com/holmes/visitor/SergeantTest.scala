package com.holmes.visitor

import org.mockito.Mockito._

/**
  * Created by denny.lao on 2017/2/24.
  */
class SergeantTest extends DummyUnitTest[Sergeant]((a)=>new Sergeant(a :_*)){
  override def verifyVisit(unit: Sergeant, mockedVisitor: UnitVisitor) = {
    verify(mockedVisitor).visitSergeant(org.mockito.Matchers.eq(unit))
  }
}
