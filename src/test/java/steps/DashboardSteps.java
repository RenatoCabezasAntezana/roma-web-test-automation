package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DashboardPage;
import pages.PageManager;


public class DashboardSteps {
    private DashboardPage dashboardPage = PageManager.instanceGet().getDashboardPage();
    @Then("se mostrará el dashboard de recursos humanos")
    public void se_mostrará_el_dashboard_de_recursos_humanos() {
        Assert.assertNotEquals("El campo está vacío", "", dashboardPage.getUser());

    }

}
