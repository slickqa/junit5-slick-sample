package com.example;


import com.example.project.Calculator;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import java.util.logging.Logger;

import static org.junit.platform.engine.discovery.DiscoverySelectors.*;

public class RunTests {
    private static final Logger logger = Logger.getLogger(RunTests.class.getName());

    public static void main(String[] args) throws Exception {

        // This is where you would determine what tests could be run

        //if ("NOT_SET".equals(System.getProperty("host", "NOT_SET"))) {
        //    logger.info("You need to pass in a -Dhost param java opt");
        //    System.exit(-1);
        //}
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(selectClass("com.example.test.CalculatorTests"))
                .build();
        Launcher launcher = LauncherFactory.create();
        launcher.execute(request);
        System.exit(0);
    }
}
