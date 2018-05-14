package com.holmes.chain

/**
  * Created by denny.lao on 2017/2/17.
  */
class OrcKing {
  val chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)))

  def makeRequest(req:Request): Unit ={
    chain.handleRequest(req)
  }
}
