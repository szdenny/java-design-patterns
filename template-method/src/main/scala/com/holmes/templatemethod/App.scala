package com.holmes.templatemethod

/**
  * Created by denny.lao on 2017/2/22.
  *
  * Template Method defines a skeleton for an algorithm. The algorithm subclasses provide
  * implementation for blank parts.
  * <p>
  * In this example {@link HalflingThief} contains {@link StealingMethod} that can be changed. First
  * the thief hits with {@link HitAndRunMethod} and then with {@link SubtleMethod}.
  */
object App {
  def main(args : Array[String]): Unit ={
    val thief = new HalflingThief(new HitAndRunMethod)

    thief.steal
    thief.changeMethod(new SubtleMethod)
    thief.steal
  }
}
