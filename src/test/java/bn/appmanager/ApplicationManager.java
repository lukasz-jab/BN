package bn.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public WebDriver wd;
    private String browser;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private WebDriverWait wait;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void start() {
        if (browser.equals("firefox")) {
            wd = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            wd = new ChromeDriver();
        }

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(wd, 3);

        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd, wait);

        wd.get("https://www.bn.org.pl/");
        sessionHelper.okCookie();
    }

    public void stop() {
        wd.quit();
        wd = null;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

}
