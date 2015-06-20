resolvers += Classpaths.typesafeReleases
resolvers += Classpaths.typesafeSnapshots

addSbtPlugin("com.danieltrinh"         % "sbt-scalariform"   % "1.3.0")
addSbtPlugin("com.eed3si9n"            % "sbt-assembly"      % "0.13.0")
addSbtPlugin("com.eed3si9n"            % "sbt-buildinfo"     % "0.3.2")

//addSbtPlugin("com.jsuereth"            % "sbt-pgp"           % "1.0.0") -- cross version conflict??
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0-RC2")
addSbtPlugin("org.xerial.sbt"          % "sbt-sonatype"      % "0.2.1")

retrieveManaged := true
