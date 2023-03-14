import Pages.AlertsFramesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabTest extends AlertsFramesPage {

    @Test
    void newTabTest()
    {
        openUrl("https://demoqa.com/browser-windows");
        Assert.assertEquals(initialTitle, getInitialTitleText(), "Titles aren't equal: Browser Windows");

        clickNewTabButton();
        tabHandler(1);
        Assert.assertEquals(originalTitle, getNewTitleText(), "Titles aren't equal: This is a sample page");
        tabHandler(0);
        Assert.assertEquals(initialTitle, getInitialTitleText(), "Titles are equal: Browser Windows");

        closeBrowser();
        System.out.println("Test passed");
        closeBrowser();
    }
}
