import Pages.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormTest extends PracticeFormPage {

    @Test
    void practiceFormsTest() {
        openUrl("https://demoqa.com/automation-practice-form");

        firstNavMenuClick();
        fillFirstName("FirstTestName");
        fillLastName("LastTestName");
        fillEmailField("test@test.com");
        fillUserNumber("1234122434");
        setSexMale();
        scrollDownJS();
        submitForm();
        Assert.assertEquals(expectedSubmissionText, getSubmissionText(), "Titles aren't equals");
        System.out.println("Test passed");
        closeBrowser();
    }


}
