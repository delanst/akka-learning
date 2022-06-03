ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

val versions = new {
    val akka = "2.6.19"
    val alpakka = "2.0.0"
    val logback = "1.2.9"
}

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % versions.akka,
    "com.typesafe.akka" %% "akka-stream" % versions.akka,
    "ch.qos.logback" % "logback-classic" % versions.logback,
    "com.lightbend.akka" %% "akka-stream-alpakka-csv" % versions.alpakka,
    "com.lightbend.akka" %% "akka-stream-alpakka-file" % versions.alpakka
)

lazy val root = (project in file("."))
  .settings(
      name := "akka-learning"
)