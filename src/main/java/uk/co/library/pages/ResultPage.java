package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utilities;

public class ResultPage extends Utilities {
    //2.ResultPage
    //  Locators - resultText
    //  Method - verifyTheResults(String expected)
    @CacheLookup
    @FindBy(css=".search-header__title")
    WebElement resultText;
    public void verifyTheResults(String expected){
        Reporter.log("The Result is : " + expected.toString());
        Assert.assertEquals(resultText.getText(),expected,"Error");
        CustomListeners.test.log(Status.PASS, "The result is : " +expected);
    }

}
