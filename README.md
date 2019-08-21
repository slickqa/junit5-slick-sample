# junit5-slick-sample

The `junit5-slick-sample` project demonstrates how to run tests based on JUnit
Jupiter and report results to slick using [slickqa-junit-jupiter extensions].  

[slickqa-junit-jupiter extensions]: https://github.com/slickqa/slickqa-junit-jupiter

There are two seperate examples of running tests in this project.  For both examples be sure to set the slick instance where tests will report: -Dslick.baseurl=\<Slick Instance Base URL> 
(Example: "http://slick.yourcompany.com")


1.  Running tests with gradle.  
    
    `./gradlew build` or `./gradlew test` will run tests. When building gradle will skip testing if they've already been run unless changes are detected.
2.  Packaging an executable jar and running tests from main.  
    - compile and create the jar just by building.  jar location is `build/libs/junit5-slick-sample.jar`
    - An example of running the jar: 
    
    ```java -Dslick.scheduleTests=false -Dslick.baseurl=http://slick.mycompany.com -Dslick.project=projectName -Dslick.release=releaseName -Dslick.build=1 -Dslick.testplan=testplanName -jar build/libs/junit5-slick-sample.jar```
