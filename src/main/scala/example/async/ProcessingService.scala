package example.async

import java.util.concurrent.Executors

import scala.concurrent.{ExecutionContext, Future}
import scala.async.Async.async

object ProcessingService {

  implicit val ec = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(10))

  def sum(arg1: Int, arg2: Int): Future[Int] = async {
    println("Executing sum() in Thread [%s]" format Thread.currentThread.getName)
    arg1 + arg2
  }

  def double(arg: Int): Future[Int] = async {
    println("Executing double() in Thread [%s]" format Thread.currentThread.getName)
    arg * 2
  }

}
