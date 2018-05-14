package com.holmes.visitor

import java.util.Optional

/**
  * Created by denny.lao on 2017/2/24.
  */
class CommanderVisitorTest extends VisitorTest[CommanderVisitor]( new CommanderVisitor, Optional.of("Good to see you commander."), Optional.empty(), Optional.empty()) {

}
