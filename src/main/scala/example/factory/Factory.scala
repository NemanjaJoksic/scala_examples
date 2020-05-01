package example.factory


trait Abstraction {
  def f(): Int
}

object Abstraction {
  def apply(i: Int): Abstraction = i match {
    case 1 => Implementation1
    case 2 => new Implementation2
    case _ => Implementation1
  }
}

object Implementation1 extends Abstraction {
  def f(): Int = 1
}

class Implementation2 extends Abstraction {
  def f(): Int = 2
}

