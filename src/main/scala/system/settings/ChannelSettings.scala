package system.settings

import com.typesafe.config.Config

private object ChannelSettings {
  private val DefaultExpRate = 1
  private val DefaultSpRate = 1
  private val DefaultMaxJoinLevel = 1
  private val DefaultMaxJoinDays = 1

}
case class ChannelSettings(private val config: Config) {
  import ChannelSettings._

  val name: String = config.getString("name")
  val expRate: Int = if (config.hasPath("expRate")) config.getInt("expRate") else DefaultExpRate
  val spRate: Int = if (config.hasPath("spRate")) config.getInt("spRate") else DefaultSpRate
  val maxJoinLevel: Int = if (config.hasPath("maxJoinLevel")) config.getInt("maxJoinLevel") else DefaultMaxJoinLevel
  val maxJoinDays: Int = if (config.hasPath("maxJoinDays")) config.getInt("maxJoinDays") else DefaultMaxJoinDays
}