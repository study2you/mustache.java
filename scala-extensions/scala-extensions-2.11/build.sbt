lazy val `scala-extensions-2-11` = project
  .in(file("."))
  .settings(
    resolvers += Resolver.mavenLocal,
    scalaVersion := "2.11.4",
    libraryDependencies ++= Seq(
      "com.github.spullara.mustache.java" % "compiler" % "0.8.17-SNAPSHOT",
      "junit" % "junit" % "4.8.2" % "test"
    )
  )
