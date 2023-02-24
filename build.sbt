ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "StudyScale",
    version := "1.0.0",
    scalaVersion := "3.0.0"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"