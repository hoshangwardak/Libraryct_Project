package com.libraryct.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report2.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"

        },
        features = "src/test/resources/features",
        glue = "com/libraryct/step_Definitions",
        dryRun = false,
        tags = "  @UserStory4"

)
public class CukesRunner {
}
