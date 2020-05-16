package system.settings

import com.typesafe.config.Config
import scala.collection.JavaConversions._

case class GroupChannelsSettings(private val config: Config) {
  val groups = config.getConfigList("groups").map(g => GroupSettings(g))
}