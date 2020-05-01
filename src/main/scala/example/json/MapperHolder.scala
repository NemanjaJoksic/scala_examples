package example.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

object MapperHolder {

  val mapper = new ObjectMapper
  mapper.registerModule(DefaultScalaModule)

}
