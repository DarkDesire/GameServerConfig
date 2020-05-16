// protobuf
PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

lazy val Version = new {
  val akka = "2.5.2"
  val akkaHttp = "10.0.7"
  val config = "1.3.1"
}

lazy val akkaDeps = Seq(
  "com.typesafe.akka" %% "akka-actor" % Version.akka,
  "com.typesafe.akka" %% "akka-testkit" % Version.akka,
  "com.typesafe.akka" %% "akka-stream" % Version.akka,
  "com.typesafe.akka" %% "akka-stream-testkit" % Version.akka,

  "com.typesafe.akka" %% "akka-agent" % Version.akka,
  "com.typesafe.akka" %% "akka-camel" % Version.akka,
  "com.typesafe.akka" %% "akka-cluster" % Version.akka,
  "com.typesafe.akka" %% "akka-cluster-metrics" % Version.akka,
  "com.typesafe.akka" %% "akka-cluster-sharding" % Version.akka,
  "com.typesafe.akka" %% "akka-cluster-tools" % Version.akka,
  "com.typesafe.akka" %% "akka-distributed-data" % Version.akka,
  "com.typesafe.akka" %% "akka-multi-node-testkit" % Version.akka,
  "com.typesafe.akka" %% "akka-osgi" % Version.akka,
  "com.typesafe.akka" %% "akka-persistence" % Version.akka,
  "com.typesafe.akka" %% "akka-persistence-query" % Version.akka,
  "com.typesafe.akka" %% "akka-persistence-tck" % Version.akka,
  "com.typesafe.akka" %% "akka-remote" % Version.akka,
  "com.typesafe.akka" %% "akka-slf4j" % Version.akka,
  "com.typesafe.akka" %% "akka-typed" % Version.akka,
  "com.typesafe.akka" %% "akka-contrib" % Version.akka,

  "com.typesafe.akka" %% "akka-http-core" % Version.akkaHttp,
  "com.typesafe.akka" %% "akka-http" % Version.akkaHttp,
  "com.typesafe.akka" %% "akka-http-testkit" % Version.akkaHttp,
  "com.typesafe.akka" %% "akka-http-spray-json" % Version.akkaHttp,
  "com.typesafe.akka" %% "akka-http-jackson" % Version.akkaHttp,
  "com.typesafe.akka" %% "akka-http-xml" % Version.akkaHttp,
  "com.typesafe.akka" %% "akka-parsing" % Version.akkaHttp
)

val allDeps = akkaDeps ++ Seq(
  // config
  "com.typesafe" % "config" % Version.config,
  // proto
  "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf"
)

lazy val gameserverjune = (project in file("."))
  .settings(
    name := "GameServerJune",
    version := "1.0",
    organization := "instagram.com/oheldarkaa",
    scalaVersion := "2.12.2",
    libraryDependencies ++= allDeps
  )