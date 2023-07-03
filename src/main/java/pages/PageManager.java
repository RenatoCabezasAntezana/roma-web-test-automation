package pages;

public class PageManager {
    private static PageManager pageManager;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    private PageManager() {
    }
    private synchronized static void instanceCreate() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
    }
    public static PageManager instanceGet() {
        instanceCreate();
        return pageManager;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }
    public DashboardPage getDashboardPage() {
        return (dashboardPage == null) ? dashboardPage = new DashboardPage() : dashboardPage;
    }
}
