package example.scheduled

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.concurrent.Executors

object Main extends App {

  val f1 = Scheduler.scheduleWithFixRate(job, 1, 2)

  implicit val executor = Executors.newSingleThreadScheduledExecutor()
  val f2 = Scheduler.scheduleWithFixRate(job, 2, 2)

  Thread.sleep(10000)

  f1.cancel(false)
  f2.cancel(true)

  executor.shutdown
  Scheduler.defaultExecutor.shutdown
  println("Stopped")

  def job: Unit = {
    val now = Calendar.getInstance().getTime()
    val minuteFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val currentMinuteAsString = minuteFormat.format(now)
    println("[%s] time: %s" format (Thread.currentThread.getName, currentMinuteAsString))
  }

}

