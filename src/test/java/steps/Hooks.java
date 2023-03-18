package steps;


import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.bouncycastle.util.Pack;
import utils.CommonMethods;

public class Hooks {
    @Before             // Before annotation (from Cucumber, not JUnit) will run before every scenario
    public void startBrowser() {
        BaseClass.setUp();
    }

    @After
    public void quitBrowser(Scenario scenario) {
//        if (scenario.isFailed()) {
//            CommonMethods.takeScreenshot("FailTests/"+scenario.getName());
//        }  BaseClass.tearDown();
    }
}