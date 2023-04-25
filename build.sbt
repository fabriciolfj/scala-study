ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "StudyScale",
    version := "0.1.0",
    scalaVersion := "3.2.2"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.4"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.4"
