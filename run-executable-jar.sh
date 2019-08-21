#!/usr/bin/env bash


java -Dslick.scheduleTests=false -Dslick.baseurl=http://slick.sofitest.com -Dslick.project=projectName -Dslick.release=releaseName -Dslick.build=1 -Dslick.testplan=testplanName -jar build/libs/junit5-slick-sample.jar