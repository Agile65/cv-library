package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage=new ResultPage();
    }

    @Test(groups={"smoke","regression"},dataProvider = "jobParameters",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result){
        //1.JobSearchTest
        //Inside JobSearchTest class create following test methods
        //1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,String result).
        //    enter job title 'jobTitle'
        homePage.enterJobTitle(jobTitle);
        //    enter Location 'location'
        homePage.enterLocation(location);
        //    select distance 'distance'
        homePage.selectDistance(distance);
        //	  click on moreSearchOptionsLink
        homePage.clickOnMoreSearchLink();
        //    enter salaryMin 'salaryMin'
        homePage.enterMinSalary(salaryMin);
        //    enter salaryMax 'salaryMax'
        homePage.enterMaxSalary(salaryMax);
        //	  select salaryType 'salaryType'
        homePage.selectSalaryType(salaryType);
        //	  select jobType 'jobType'
        homePage.selectJobType(jobType);
        //	  click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();
        //	  verify the result 'result'
        resultPage.verifyTheResults(result);
        //Data set
        //
        //|jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
        //|Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
        //
        //Create 6 More data set.
    }


}
