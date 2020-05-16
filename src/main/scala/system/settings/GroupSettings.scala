package system.settings

import com.typesafe.config.Config
import scala.collection.JavaConversions._

case class GroupSettings(private val config: Config) {
  val name = config.getString("name")
  val channels = config.getConfigList("channels").map(c => ChannelSettings(c))
}
