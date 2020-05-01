package example.async


object Main extends App {

  val arg1 = 10
  val arg2 = 20

  implicit val ec = scala.concurrent.ExecutionContext.Implicits.global

  ProcessingService.sum(arg1, arg2).onComplete(res => {
    println("Executing onComplete() in Thread [%s]" format Thread.currentThread.getName)
    println("sum result: %d" format res.get)
  })

  ProcessingService.double(arg1).onComplete(res => {
    println("Executing onComplete() in Thread [%s]" format Thread.currentThread.getName)
    println("double result: %d" format res.get)
  })

  Thread.sleep(2000)
  println("Finished")
  System.exit(1)

}
