package com.example;


import java.util.logging.Logger;

public class RunTests {
    private static final Logger logger = Logger.getLogger(RunTests.class.getName());

    public static void main(String[] args) throws Exception {

        if ("NOT_SET".equals(System.getProperty("host", "NOT_SET"))) {
            logger.info("You need to pass in a -Dhost param java opt");
            System.exit(-1);
        }
        if ("true".equalsIgnoreCase(System.getProperty("scheduleTests", "false"))) {
            logger.info("We will just schedule the tests in Slick and not run them");
            // since we are scheduling tests we will remove any retry
            System.setProperty("maxRetry", "0");
        }
        if ("true".equalsIgnoreCase(System.getProperty("doNotRunTests", "false"))) {
            logger.info("We will just list out the tests, we will not run them");
        }

        System.exit(0);
    }
}
