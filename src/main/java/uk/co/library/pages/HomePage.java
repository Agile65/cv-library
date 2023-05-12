package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utilities;

public class HomePage extends Utilities {
    // 1.HomePage -
    //  Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
    //  Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
    //  enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
    //  clickOnFindJobsButton().
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(id = "location")
    WebElement location;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle1){
        Reporter.log("Enter job title" + jobTitle.toString());
        sendTextToElement(jobTitle,jobTitle1);
        CustomListeners.test.log(Status.PASS, "Enter job Title" +jobTitle1);
    }
    public void enterLocation(String location1){
        Reporter.log("Enter job title" + location.toString());
        sendTextToElement(location,location1);
        CustomListeners.test.log(Status.PASS, "Enter location" +location1);
    }
    public void selectDistance(String distance1){
        Reporter.log("Enter job title" + distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown,distance1);
        CustomListeners.test.log(Status.PASS, "Enter distance" +distance1);
    }
    public void clickOnMoreSearchLink(){
        Reporter.log("Click on More search link" + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "Click on more search link");
    }
    public void enterMinSalary(String minSalary){
        Reporter.log("Enter min salary" + salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
        CustomListeners.test.log(Status.PASS, "Enter min salary " +minSalary );
    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("Enter max Salary" + salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
        CustomListeners.test.log(Status.PASS, "Enter max salary " +maxSalary );
    }
    public void selectSalaryType(String sType){
        Reporter.log("Enter salary type" + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        CustomListeners.test.log(Status.PASS, "Enter salary type " +salaryTypeDropDown );
    }
    public void selectJobType(String jobType){
        Reporter.log("Select job type " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        CustomListeners.test.log(Status.PASS, "Select job type " +jobTypeDropDown );
    }
    public void clickOnFindJobsButton(){
        Reporter.log("Click on find jobs buttons " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "Click on find jobs buttons "  );
    }
}
