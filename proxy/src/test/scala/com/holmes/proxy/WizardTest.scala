package com.holmes.proxy

import org.junit.Assert._
import org.junit.Test

/**
  * Created by denny.lao on 2017/2/15.
  */
class WizardTest {
  @Test def testToString = {
    val wizardNames = Array("Gandalf", "Dumbledore", "Oz", "Merlin")

    wizardNames.foreach(name => assertEquals(name, new Wizard(name).toString))
  }
}
