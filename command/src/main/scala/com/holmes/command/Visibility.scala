package com.holmes.command

/**
  * Created by denny.lao on 2017/2/17.
  */
object Visibility extends Enumeration {
  type Visibility = Value
  val VISIBLE = Value("visible")
  val INVISIBLE = Value("invisible")
  val UNDEFINED = Value("")
}
