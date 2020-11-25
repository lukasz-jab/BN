package bn.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;

public class SessionHelper {

    private WebDriver wd;
    private WebDriverWait wait;

    public SessionHelper(WebDriver wd, WebDriverWait wait) {
        this.wd = wd;
        this.wait = wait;
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void okCookie() {
        if (isElementPresent(cssSelector("button[data-role=close-and-accept-consent]"))) ;
        {
            wait.until(wd -> wd.findElement(cssSelector("button#okCookie"))).click();
        }
    }

}
