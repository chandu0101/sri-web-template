enablePlugins(ScalaJSPlugin)

name := "sri-web-template"

scalaVersion := "2.11.7"

val sriVersion = "0.3.0"

libraryDependencies ++= Seq("com.github.chandu0101.sri" %%% "web" % sriVersion)

val assetsDir = "assets/"

// copy fastOptJS/fullOptJS  fiels to assets directory
crossTarget in(Compile, fullOptJS) := file(assetsDir)
crossTarget in(Compile, fastOptJS) := file(assetsDir)
crossTarget in(Compile, packageScalaJSLauncher) := file(assetsDir)
artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

