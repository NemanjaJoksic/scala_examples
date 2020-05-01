package example.scheduled

import java.util.concurrent.{Executors, Future, ScheduledExecutorService, TimeUnit}

object Scheduler {

  private class Task (job: => Unit) extends Runnable {
    def run: Unit = job
  }

  val defaultExecutor = Executors.newSingleThreadScheduledExecutor()

  def scheduleWithFixRate(job: => Unit, initialDelay: Int, period: Int)(implicit executor: ScheduledExecutorService = defaultExecutor): Future[_] = {
    executor.scheduleAtFixedRate(new Task(job), initialDelay, period, TimeUnit.SECONDS)
  }

  def scheduleWithFixedDelay(job: => Unit, initialDelay: Int, period: Int)(implicit executor: ScheduledExecutorService = defaultExecutor): Future[_] = {
    executor.scheduleWithFixedDelay(new Task(job), initialDelay, period, TimeUnit.SECONDS)
  }

  def schedule(job: => Unit, delay: Int)(implicit executor: ScheduledExecutorService = defaultExecutor): Future[_] = {
    executor.schedule(new Task(job), delay, TimeUnit.SECONDS)
  }

}
