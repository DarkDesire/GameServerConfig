package system.settings

import com.typesafe.config.Config

case class PlayerSettings(private val config: Config) {
  val startLevel = config.getInt("default.startLevel")
  val startHealth = config.getInt("default.startHealth")
  val startManna = config.getInt("default.startManna")
}
