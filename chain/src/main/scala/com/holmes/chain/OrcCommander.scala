package com.holmes.chain

/**
  * Created by denny.lao on 2017/2/17.
  */
class OrcCommander(handler: RequestHandler) extends RequestHandler(handler: RequestHandler){
  override def handleRequest(req: Request): Unit = {
    if(req.requestType.equals(RequestType.DEFEND_CASTLE)){
      printHandling(req)
      req.markHandled()
    }
    else{
      super.handleRequest(req)
    }
  }

  override def toString: String = "Orc commander"
}
