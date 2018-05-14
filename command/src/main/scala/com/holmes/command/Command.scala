package com.holmes.command

/**
  * Created by denny.lao on 2017/2/17.
  *
  * Interface for Commands.
  */
abstract class Command {
  def execute(target: Target)

  def undo

  def redo

  def toString(): String
}
