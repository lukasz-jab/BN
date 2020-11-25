package bn.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PolonaPLTest extends TestBase {

    @Test
    public void testPolonaPL() {

        app.getNavigationHelper().openMainMenu();
        app.getNavigationHelper().openPolonaPLSite();

        Assert.assertEquals(app.wd.getCurrentUrl(), "https://polona.pl/");
    }
}
