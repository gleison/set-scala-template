// build definition
lazy val root = (project in file(".")).
  settings(
    name := "sbt-scala-template",
    scalaVersion := "2.11.7",
    version := "1.0-SNAPSHOT",
    libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3",
    resolvers += Resolver.mavenLocal
  )
