package example.singleton

trait Singleton {

  def f1: String

  def f2: Int

}

object Singleton {

  def instance: Singleton = SingletonImpl

}
