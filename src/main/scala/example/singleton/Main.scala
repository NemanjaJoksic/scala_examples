package example.singleton

object Main extends App {

  val singleton = Singleton.instance

  println("f1() = %s" format singleton.f1)
  println("f2() = %d" format singleton.f2)

}
