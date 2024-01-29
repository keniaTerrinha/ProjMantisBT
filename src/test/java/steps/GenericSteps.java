package steps;

import core.Driver;
import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class GenericSteps {

    @Before
    public void init(Scenario scenario) {
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(scenario.getName());
        Driver.criaDiretorio();
    }


    @After
    public void finish(Scenario cenario) throws IOException {

        if (Driver.getDriver() != null) {
            if (cenario.isFailed()) {
                Driver.criaDiretorio();
                Driver.printScreen("scenario failed");
            }

          Driver.getDriver().quit();
        }


    }
}
