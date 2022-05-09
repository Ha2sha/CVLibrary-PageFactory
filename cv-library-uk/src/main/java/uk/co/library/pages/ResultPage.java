package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;


public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void verifyTheResults(String expected) {
        CustomListeners.test.log(Status.PASS,"Verifying Test Results "+resultText.toString());
        verifyThatTextIsDisplayed(resultText, expected);
    }


}
