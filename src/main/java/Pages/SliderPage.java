package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage extends BasePage {

    private final String sliderValue = "//*[@id='sliderValue']";
    private final String sliderRange = "//input[@class='range-slider range-slider--primary']";

    private WebElement getSliderElement(){
        return driver.findElement(By.xpath(sliderRange));
    }

    public String getSliderValue() {
        return getValueSelenium(sliderValue);
    }

    private void setupSlider(int xoffset){
        Actions SliderAction = new Actions(driver);
        SliderAction.clickAndHold(getSliderElement()).moveByOffset(-getSliderElement().getSize().width, 0).release().perform();
        SliderAction.clickAndHold(getSliderElement()).moveByOffset(xoffset, 0).release().perform();
    }

    public void setupSlider0() {
        setupSlider(-getSliderElement().getSize().width);

    }

    public void setupSlider100() {
        setupSlider(getSliderElement().getSize().width);
    }

    public void setupExactSliderValue(int exact){
        Actions action= new Actions(driver);
        action.clickAndHold(getSliderElement()).moveByOffset(-getSliderElement().getSize().width, 0).release().perform();
        for (int i = 0; i < exact; i++)
        {
            action.sendKeys(Keys.ARROW_RIGHT).build().perform();

        }
    }


}
