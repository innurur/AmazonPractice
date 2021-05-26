package com.Amazon.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/json-report.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/feature",
        glue = "com/Amazon/step_definition",
        dryRun = false,
        tags = "@search"
)


public class CuckesRunner {}
