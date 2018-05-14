package com.holmes.command

import org.junit.Test

/**
  * Created by denny.lao on 2017/2/17.
  *
  * Tests that Command example runs without errors.
  */
object AppTest {
  @Test def test: Unit = {
    val args = new Array[String](0)

    App.main(args)
  }
}
