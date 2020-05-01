package example.template

// can be abstract class too
trait AbstractTemplate {
  def templateMethod(arg1: String, arg2: String): Unit = {
    // DO SOMETHING
    print(arg1, arg2)
    // DO SOMETHING
  }

  protected def print(arg1: String, arg2: String): Unit

}

class TemplateImpl extends AbstractTemplate {

  override protected def print(arg1: String, arg2: String): Unit = {
    println("arg1 = %s, arg2 = %s" format(arg1, arg2))
  }

}
