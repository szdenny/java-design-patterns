package com.holmes.observer.generic

/**
  * Created by denny.lao on 2017/3/9.
  */
trait Observer[S <: Observable[S, O, A], O <: Observer[S, O, A], A] {
  def update(subject: S, argument: A)
}
