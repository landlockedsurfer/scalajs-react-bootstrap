name := "React Scala.js Sandbox"

scalaVersion := "2.11.6"

enablePlugins(ScalaJSPlugin)

// Minimal usage
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "0.9.0",
  "com.chandu0101.scalajs-react-components" %%% "core" % "0.0.1-SNAPSHOT"
)
