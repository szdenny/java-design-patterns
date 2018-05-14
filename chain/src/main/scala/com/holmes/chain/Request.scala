package com.holmes.chain

import com.holmes.chain.RequestType.RequestType

/**
  * Created by denny.lao on 2017/2/16.
  */
class Request(val requestType: RequestType, requestDescription: String) {
  var handled = false

  def markHandled(): Unit = {
    handled = true
  }

  def isHanded: Boolean = handled

  override def toString: String = this.requestDescription
}

object RequestType extends Enumeration {
  type RequestType = Value
  val DEFEND_CASTLE, TORTURE_PRISONER, COLLECT_TAX = Value
}