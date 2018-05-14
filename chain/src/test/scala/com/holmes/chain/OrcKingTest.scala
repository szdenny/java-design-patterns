package com.holmes.chain

import org.junit.Assert._
import org.junit.Test

/**
  * Created by denny.lao on 2017/2/17.
  */
class OrcKingTest {
  @Test def testMakeRequest: Unit = {
    val king = new OrcKing
    OrcKingTest.REQUESTS.foreach(request => {
      king.makeRequest(request)
      assertTrue("Expected all requests from King to be handled, but [" + request + "] was not!", request.isHanded)
    })
  }
}

object OrcKingTest {
  val REQUESTS = Array(
    new Request(RequestType.DEFEND_CASTLE, "Don't let the barbarians enter my castle!!"),
    new Request(RequestType.TORTURE_PRISONER, "Don't just stand there, tickle him!"),
    new Request(RequestType.COLLECT_TAX, "Don't steal, the King hates competition ..."))
}
