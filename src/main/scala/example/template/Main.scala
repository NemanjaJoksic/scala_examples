package example.template

import example.template.TemplatePatternFP.templateMethodImpl

object Main extends App {

  println("Testing FP template")
  templateMethodImpl("1", "2")

  println("Testing OOP template")
  val t = new TemplateImpl
  t.templateMethod("1", "2")

}
