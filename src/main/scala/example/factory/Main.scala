package example.factory

object Main extends App {

  val a1 = Abstraction(1)
  val a2 = Abstraction(2)
  val a3 = Abstraction(3)

  println(a1.f)
  println(a2.f)
  println(a3.f)

}
