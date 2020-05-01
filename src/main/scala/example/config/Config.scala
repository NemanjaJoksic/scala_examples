package example.config


object Config {

  val testProperty1 = Configuration.loadString("app.test.property1")
  val testProperty2 = Configuration.loadInt("app.test.property2")

}
