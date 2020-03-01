import sbt.Keys.{libraryDependencies, scalaVersion, version}


lazy val root = (project in file(".")).
  settings(
    name := "CSE512-Project-Phase1-Template",

    version := "0.1.0",

    scalaVersion := "2.11.12",

    organization  := "org.datasyslab",

    publishMavenStyle := true,

    mainClass := Some("cse512.SparkSQLExample")
  )

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.2" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.3.2" % "provided",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.specs2" %% "specs2-core" % "2.4.16" % "test",
  "org.specs2" %% "specs2-junit" % "2.4.16" % "test"
)