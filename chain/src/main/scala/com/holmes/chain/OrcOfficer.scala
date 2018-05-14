package com.holmes.chain

/**
  * Created by denny.lao on 2017/2/17.
  */
class OrcOfficer(handler: RequestHandler) extends RequestHandler(handler: RequestHandler) {
  override def handleRequest(req: Request): Unit = {
    if(req.requestType.equals(RequestType.TORTURE_PRISONER)){
      printHandling(req)
      req.markHandled()
    }
    else {
      super.handleRequest(req)
    }
  }

  override def toString: String = "Orc officer"
}
