package Pages;

import java.util.concurrent.TimeUnit;

public class PracticeFormPage extends BasePage {
    String firstNameField = "//*[@id='firstName']";
    String lastNameField = "//*[@id='lastName']";
    String emailField = "//*[@id='userEmail']";

    String radioButtonMale = "//*[@id='gender-radio-1']/..";
    String radioButtonNonMale = "//*[@id='gender-radio-2']";
    String radioButtonOther = "//*[@id='gender-radio-3']";
    String userNumberField = "//*[@id='userNumber']";
    String submitButton = "//*[@id='submit']";
    String navMenuFirst = "//*[@class='element-group'][1]";

    public void fillFirstName(String text) {
        typeSelenium(firstNameField, text);
    }


    public void fillLastName(String text) {
        typeSelenium(lastNameField, text);
    }


    public void fillEmailField(String text) {
        typeSelenium(emailField, text);
    }


    public void fillUserNumber(String text) {
        typeSelenium(userNumberField, text);
    }

    public void setSexMale() {
        clickSelenium(radioButtonMale);
    }

    public void submitForm(){
        clickSelenium(submitButton);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void firstNavMenuClick(){
        clickSelenium(navMenuFirst);
    }

    //id="example-modal-sizes-title-lg"
    //Thanks for submitting the form

    public String actualFormSubmissionText = "//*[@id='example-modal-sizes-title-lg']";

    public String getSubmissionText(){
        return getTextSelenium(actualFormSubmissionText);
    }

    public String expectedSubmissionText = "Thanks for submitting the form";


}
