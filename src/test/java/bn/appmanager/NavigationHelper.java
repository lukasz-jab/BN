package bn.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.cssSelector;

public class NavigationHelper {

    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void openAktualnosciDlaBibliotekarzy() {
        ((JavascriptExecutor) wd).executeScript("arguments[0].click()",
                wd.findElement(By.xpath("//a[@href = '/aktualnosci']//h3[. = 'Aktualności']")));
    }

    public void openDlaBibliotekarzySIte() {
        wd.findElement(cssSelector("div.container ul[id = 'menu-list'] a[href = '/dla-bibliotekarzy']")).click();
    }

    public void openMainMenu() {
        wd.findElement(cssSelector("div#header-wrapper button[class = 'navbar-toggle collapsed']")).click();
    }

    public void openPolonaPLSite() {
        wd.findElement(By.cssSelector("ul[id = 'menu-list'] a[href = 'https://polona.pl']")).click();
    }
}
