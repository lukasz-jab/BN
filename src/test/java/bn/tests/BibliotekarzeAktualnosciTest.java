package bn.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BibliotekarzeAktualnosciTest extends TestBase {

    @Test
    public void testBibliotekarzeAktualnosci() {

        app.getNavigationHelper().openMainMenu();
        app.getNavigationHelper().openDlaBibliotekarzySIte();
        app.getNavigationHelper().openAktualnosciDlaBibliotekarzy();

        //Test sprawdza istnienie nagłówka AKTUALNOŚCI na stronie
        Assert.assertTrue(app.wd.findElement(By.cssSelector("div.container.general-title h2")).getText().equals("AKTUALNOŚCI"));

    }

}
