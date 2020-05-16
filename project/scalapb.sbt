addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.8")

libraryDependencies ++= Seq(
  // protobuf
  "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.0-pre4"
)