package example.config

import com.typesafe.config.ConfigFactory
import scala.util.Properties

object Configuration {

  val properties = ConfigFactory.load()

  def loadString(name: String): String = Properties.envOrElse(name, properties.getString(name))

  def loadInt(name: String): Int = loadString(name).toInt

}
