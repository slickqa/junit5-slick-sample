# junit5-slick-sample 
The `junit5-slick-sample` project demonstrates how to run tests based on JUnit
Jupiter and report results to slick using [slickqa-junit-jupiter extensions].  

[slickqa-junit-jupiter extensions]: https://github.com/slickqa/slickqa-junit-jupiter

There are two seperate examples of running tests in this project.  For both examples be sure to set the slick instance where tests will report: -Dslick.baseurl=\<Slick Instance Base URL> 
(Example: "http://slick.yourcompany.com")


1.  Running tests with gradle.  
    
    - Tests will run with `./gradlew build` or `./gradlew test` When building gradle will skip testing if they've already been run unless changes are detected.
    - System properties needed for Slick can easily be set in your gradle build file.  "slick.build" is an example of a system property that comes from an environment variable"
    
    ```
    test {
       	// Set these to report to slick.  You'll notice we get the build from an environment variable
       	//systemProperty "slick.scheduleTests", "false"
       	//systemProperty "slick.baseurl", "http://slick.mycompany.com"
       	//systemProperty "slick.project", "higg"
       	//systemProperty "slick.release", "releaseName"
       	//systemProperty "slick.build", System.getenv("BUILD")
       	//systemProperty "slick.testplan", "testplanName"
       	useJUnitPlatform()
       	testLogging {
        	events "passed", "skipped", "failed"
        	}
    }
    ```
       	
       	
2.  Packaging an executable jar and running tests from main.  
    - compile and create the jar just by building.  jar location is `build/libs/junit5-slick-sample.jar`
    - An example of running the jar: 
    
    ```java -Dslick.scheduleTests=false -Dslick.baseurl=http://slick.mycompany.com -Dslick.project=projectName -Dslick.release=releaseName -Dslick.build=1 -Dslick.testplan=testplanName -jar build/libs/junit5-slick-sample.jar```
