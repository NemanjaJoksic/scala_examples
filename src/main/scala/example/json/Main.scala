package example.json


object Main extends App {
  val json = "{\n\t\"id\": 123,\n\t\"sender\": \"John\",\n\t\"created-at\": \"2019-12-12 22:12:32\"\n}"
  println(json)

  val p = MapperHolder.mapper.readValue(json, classOf[Package])

  println("---------------")
  println("id: %d" format p.id)
  println("sender: %s" format p.sender)
  println("createdAt: %s" format p.createdAt)
  println("---------------")

  val copyP = Package(p.id, p.sender, null)
  println("package: %s" format MapperHolder.mapper.writeValueAsString(copyP))
  println("---------------")

}
