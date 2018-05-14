package com.holmes.proxy

import com.holmes.proxy.utils.InMemoryAppender
import org.junit.Assert._
import org.junit.{After, Before, Test}

/**
  * Created by denny.lao on 2017/2/15.
  */
class IvoryTowerTest {
  var appender: InMemoryAppender = null

  @Before def setUp = {
    appender = new InMemoryAppender(classOf[IvoryTower])
  }

  @After def tearDown = {
    appender.stop
  }

  @Test def testEnter = {
    val wizards = Array(new Wizard("Gandalf"), new Wizard("Dumbledore"), new Wizard("Oz"), new Wizard("Merlin"))

    val tower: IvoryTower = new IvoryTower
    wizards.foreach(wizard => tower.enter(wizard))

    assertTrue(appender.logContains("Gandalf enters the tower."))
    assertTrue(appender.logContains("Dumbledore enters the tower."))
    assertTrue(appender.logContains("Oz enters the tower."))
    assertTrue(appender.logContains("Merlin enters the tower."))

    assertEquals(4, appender.getLogSize())
  }
}
