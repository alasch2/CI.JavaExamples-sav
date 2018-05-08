The repository contains example projects for build the the sealights.
It is possible to build all the projects as a single multi-project application or individually.
When built as an individual project, the different application name is assigned to the build.

Maven examples:
1. Build number should be provided as system property '-Dbuild=<build value>'
2. Most of plugin attributes are defined in the pom of the root project; 
the sub-projects poms contain only application name and included packages.
3. The profile 'all' should be used for build of all projects as multi-module application:

   _mvn clean install -Pall -Dbuild=12345_
4. The default profile is a single project build. 
To run the subproject build from the root directory use the -f option:

   _mvn clean install -f example-java8  -Dbuild=12345_  
   
   To run it from the subproject directory:
   
   _mvn clean install -Dbuild=12345_  
   

Gradle examples:
1. The sealights plugin is activated with the option '-P sl'
2. Most of plugin attributes are defined in the build.gradle of the root project; the sub-projects build.gradle
 contain only application name and included packages.

3. To run multi-project build provide the option '-P all' (is relevant, if '-P sl' option was provided):

    _gradle build test -P sl -P all -Dbuild=22222_
3. The subproject build (with individual application name) should be run from the subproject directory:

   _gradle build test -P sl -Dbuild=22222_
 