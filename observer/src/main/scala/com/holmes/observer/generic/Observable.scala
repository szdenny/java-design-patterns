package com.holmes.observer.generic

import java.util.concurrent.CopyOnWriteArrayList

/**
  * Created by denny.lao on 2017/3/9.
  * Generic observer inspired by Generics and Collection by Naftalin & Wadler
  *
  * @Param [S] Subject
  * @Param [O] Observer
  * @Param [A] Argument type
  */
abstract class Observable[S <: Observable[S, O, A], O <: Observer[S, O, A], A] {
  protected val observers = new CopyOnWriteArrayList[O]()

  def addOberver(observer: O): Unit = {
    observers.add(observer)
  }

  def removeObserver(observer: O): Unit = {
    observers.remove(observer)
  }

  def notifyObservers(argument: A): Unit = {
    observers.forEach((t: O) => {
      t.update(this.asInstanceOf[S], argument)
    })
  }
}
