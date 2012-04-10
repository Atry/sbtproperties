import sbt._
import Keys._

object SbtPropertiesPluginBuild extends Build {
  lazy val sbtRelease =
    RootProject(uri("git://github.com/Atry/sbt-release.git#develop"))

  lazy val sbtscalariform =
    RootProject(uri("git://github.com/typesafehub/sbtscalariform.git#sbt-0.12"))

  lazy val root =
    Project(id = "root", base = file(".")).
      dependsOn(sbtRelease, sbtscalariform)

}

// vim: set ts=2 sw=2 et:
