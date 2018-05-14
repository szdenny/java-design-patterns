package com.holmes.chain

import org.slf4j.LoggerFactory

/**
  * Created by denny.lao on 2017/2/16.
  */
abstract class RequestHandler(next: RequestHandler) {
  def handleRequest(req: Request) {
    if (next != null) {
      next.handleRequest(req)
    }
  }

  protected def printHandling(req: Request): Unit = {
    RequestHandler.LOGGER.info("{} handling request \"{}\"", this, req.asInstanceOf[Any])
  }
}

object RequestHandler {
  val LOGGER = LoggerFactory.getLogger(classOf[RequestHandler])
}
