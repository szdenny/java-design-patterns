package com.holmes.command

/**
  * Created by denny.lao on 2017/2/17.
  */
object Size extends Enumeration {
  type Size = Value

  val SMALL = Value("small")
  val NORMAL = Value("normal")
  val LARGE = Value("large")
  val UNDEFINED = Value("")
}
