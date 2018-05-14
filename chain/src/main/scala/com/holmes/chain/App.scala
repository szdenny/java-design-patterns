package com.holmes.chain

/**
  * Created by denny.lao on 2017/2/17.
  */
object App {
  def main(args:Array[String]): Unit ={
    val king = new OrcKing
    king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castel"))
    king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"))
    king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"))
  }
}
