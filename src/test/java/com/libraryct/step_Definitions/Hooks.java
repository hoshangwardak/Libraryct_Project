package com.libraryct.step_Definitions;

import com.libraryct.pages.Login;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    Login login = new Login();

    @Before(order = 1)
     public void setUpScenario(){
      login.getEnvironment("qa1");
    }


    @After (order = 2)
    public void tearDownScenario(Scenario scenario){
        //if my scenario failed
        // go and take screen shot

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(5);
        Driver.closeDriver();

    }




}
