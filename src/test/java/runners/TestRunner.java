package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features"  // specify path from content root, features option will establish connection with feature file(s)
        , glue = "steps"     // specify path from source root, glue will establish connection with step definitions
        , dryRun = true   // if set to true it will check if all step definitions have implementation. Like headless(without running)
        , monochrome = true // This will print test result in more human readable format in console
        // tags = "@smoke",      // run(test(s) with provided tag name  // and == &&, or ==||
        // tags = "@testingnow"
        //tags = "@login2"
        , tags = "@login"

)


public class TestRunner {


}
