package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
//import org.testng.annotations.Test;

public class BasePage {
  //  System.setProperty("Webdriver.chrome.driver", "chromedriver");
   WebDriver driver = new ChromeDriver();

   public void openUrl (String url){
       driver.get(url);
       driver.manage().window().maximize();
       JavascriptExecutor executor = (JavascriptExecutor)driver;
   }

   public void closeBrowser(){
       driver.quit();
   }

   public void clickSelenium(String xpath){
       driver.findElement(By.xpath(xpath)).click();
   }

   public void clickSeleniumJS(String xpath){
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", driver.findElement(By.id(xpath)));
    }

    public void typeSelenium(String xpath, String text){
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public String getTextSelenium(String xpath){
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public String getValueSelenium(String xpath){
        return driver.findElement(By.xpath(xpath)).getAttribute("value");
    }

    public void scrollDownJS(){
       JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void tabHandler(int tabNumber){
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(tabNumber));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    public void clickSliderJS(String slider){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].setAttribute('style', 'left: 5%;')", slider);
    }


}
