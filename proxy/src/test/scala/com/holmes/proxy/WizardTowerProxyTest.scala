package com.holmes.proxy

import com.holmes.proxy.utils.InMemoryAppender
import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.{After, Before, Test}

/**
  * Created by denny.lao on 2017/2/15.
  */
class WizardTowerProxyTest {
  var appender: InMemoryAppender = null

  @Before def setUp(): Unit = {
    appender = new InMemoryAppender()
  }

  @After def tearDown(): Unit = {
    appender.stop()
  }

  @Test def testEnter() = {
    val wizards = Array(new Wizard("Gandalf"), new Wizard("Dumbledore"), new Wizard("Oz"), new Wizard("Merlin"))

    val proxy = new WizardTowerProxy()
    wizards.foreach(proxy.enter)

    assertTrue(appender.logContains("Gandalf enters the tower."))
    assertTrue(appender.logContains("Dumbledore enters the tower."))
    assertTrue(appender.logContains("Oz enters the tower."))
    assertTrue(appender.logContains("Merlin is not allowed to enter!"))

    assertEquals(4, appender.getLogSize())
  }
}
