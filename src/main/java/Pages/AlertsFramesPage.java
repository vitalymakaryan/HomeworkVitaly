package Pages;

public class AlertsFramesPage extends BasePage{

    public String newTabButton = "//*[@id='tabButton']";
    public String newTabTitle = "//*[@id='sampleHeading']";
    public String initialTabTitle = "//*[@class='main-header']";


    public String getNewTitleText(){
        return getTextSelenium(newTabTitle);
    }

    public String getInitialTitleText(){
        return getTextSelenium(initialTabTitle);
    }

    public void clickNewTabButton(){
        clickSelenium(newTabButton);
    }

    public String initialTitle = "Browser Windows";
    public String originalTitle = "This is a sample page";


}
