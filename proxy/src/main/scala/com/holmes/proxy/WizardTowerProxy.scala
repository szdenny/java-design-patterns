package com.holmes.proxy

import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by denny.lao on 2017/2/14.
  */
class WizardTowerProxy(tower: WizardTower) extends WizardTower {
  var numWizards: Int = 0

  def this() = {
    this(new IvoryTower)
  }

  override def enter(wizard: Wizard) = {
    if(numWizards < WizardTowerProxy.NUM_WIZARDS_ALLOWED){
      tower.enter(wizard)
      numWizards += 1
    }
    else{
      WizardTowerProxy.LOGGER.info("{} is not allowed to enter!", wizard)
    }

  }
}

object WizardTowerProxy {
  val LOGGER: Logger = LoggerFactory.getLogger(classOf[WizardTowerProxy])

  val NUM_WIZARDS_ALLOWED = 3
}