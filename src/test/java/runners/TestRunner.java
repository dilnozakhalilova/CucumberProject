package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/searchEmployee.feature",  // specify path from content root, features option will establish connection with feature file(s)
        glue = "steps/SearchEmployeeSteps.java"      // specify path from source root, glue will establish connection with step definitions
)







public class TestRunner {


}
