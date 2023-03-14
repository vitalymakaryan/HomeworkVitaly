import Pages.SliderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends SliderPage {

    @Test
    void sliderTest() {
        openUrl("https://demoqa.com/slider");

        setupExactSliderValue(79);
        Assert.assertEquals(getSliderValue(), "79", "Slider Set to 79");
        setupExactSliderValue(2);
        Assert.assertEquals(getSliderValue(), "2", "Slider Set to 2");

        setupSlider0();
        Assert.assertEquals(getSliderValue(), "0", "Slider Set to 0");
        setupSlider100();
        Assert.assertEquals(getSliderValue(), "100", "Slider Set to 100");

        System.out.println("Test passed");
        closeBrowser();

    }

}
