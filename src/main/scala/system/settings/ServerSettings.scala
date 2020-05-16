package system.settings

import com.typesafe.config.ConfigFactory

case object ServerSettings {
  private val server = ConfigFactory.load().getConfig("server")
  val player = PlayerSettings(server.getConfig("player"))
  val groupChannels = GroupChannelsSettings(server.getConfig("groupChannels"))
}
