package example.template

object TemplatePatternFP {

  def templateMethod(arg1: String, arg2: String, print: (String, String) => Unit): Unit = {
    // DO SOMETHING
    print(arg1, arg2)
    // DO SOMETHING
  }

  def templateMethodImpl(arg1: String, arg2: String): Unit = {
    templateMethod(arg1, arg2, printStdout);
  }

  def printStdout(arg1: String, arg2: String): Unit = {
    println("arg1 = %s, arg2 = %s" format(arg1, arg2))
  }

}
