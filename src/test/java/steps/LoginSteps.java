package steps;

import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;
import pages.LoginPage;
import pages.PageManager;

import java.util.Map;

public class LoginSteps {
    private LoginPage loginPage = PageManager.instanceGet().getLoginPage();
    @Given("que me logeo con mis credenciales")
    public void que_me_logeo_con_mis_credenciales(DataTable dataTable) {
        Map<String, String> dataUser = dataTable.asMaps().get(0);
        loginPage.withUserName(dataUser.get("username"))
                 .withPassword(dataUser.get("password"))
                 .clickLogin();

    }
}
