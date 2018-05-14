package com.holmes.proxy

object App{
    def main(args:Array[String]): Unit ={
      val proxy :WizardTowerProxy = new WizardTowerProxy

      proxy.enter(new Wizard("Red wizard"))
      proxy.enter(new Wizard("White wizard"))
      proxy.enter(new Wizard("Black wizard"))
      proxy.enter(new Wizard("Green wizard"))
      proxy.enter(new Wizard("Brown wizard"))
    }
}