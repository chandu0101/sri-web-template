enablePlugins(ScalaJSPlugin)

name := "sri-web-template"

scalaVersion := "2.11.8"

val sriVersion = "0.5.0"

val sriscalaCssVersion = "2016.5.0"

libraryDependencies ++= Seq("com.github.chandu0101.sri" %%% "web" % sriVersion,
  "com.github.chandu0101.sri" %%% "scalacss" % sriscalaCssVersion)

val assetsDir = "assets/"

// copy fastOptJS/fullOptJS  fiels to assets directory
crossTarget in(Compile, fullOptJS) := file(assetsDir)
crossTarget in(Compile, fastOptJS) := file(assetsDir)
crossTarget in(Compile, packageScalaJSLauncher) := file(assetsDir)
artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
  "-language:postfixOps", "-language:implicitConversions",
  "-language:higherKinds", "-language:existentials")

