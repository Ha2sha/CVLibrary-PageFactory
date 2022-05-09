package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;


public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllBtn;

    @FindBy(id ="keywords")
    WebElement jobTitle1;

    @FindBy(id ="location")
    WebElement location1;

    @FindBy(id ="distance")
    WebElement distance1;

    @FindBy(id="toggle-hp-search")
    WebElement moreSearchOption1;

    @FindBy(id="salarymin")
    WebElement salaryMin1;

    @FindBy(id="salarymax")
    WebElement salaryMax1;

    @FindBy(id="salarytype")
    WebElement salaryTypeDropDown1;

    @FindBy(id="tempperm")
    WebElement jobTypeDropDown1;

    @FindBy(id="hp-search-btn")
    WebElement findJobBtn;

    public void acceptIFrameAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllBtn);
        CustomListeners.test.log(Status.PASS,"Accepting all cookies : " + acceptAllBtn.toString());

    }

    public void addJobTitle(String jobTitle){
        CustomListeners.test.log(Status.PASS,"Entering Job Title : " + jobTitle1.toString());
        sendTextToElement(jobTitle1,jobTitle);
    }
    public void addLocation(String location){
        CustomListeners.test.log(Status.PASS,"Entering Location : " + location1.toString());
        sendTextToElement(location1,location);
    }

    public void selectDistance(String distance){
        CustomListeners.test.log(Status.PASS,"Selecting Distance : " + distance1.toString());
        selectByVisibleTextFromDropDown(distance1,distance);
    }
    public void clickOnMoreSearchOption(){
        CustomListeners.test.log(Status.PASS,"Clicking on More Search Options : " + moreSearchOption1.toString());
        clickOnElement(moreSearchOption1);
    }
    public void enterMinSalary(String minSalary){
        CustomListeners.test.log(Status.PASS,"Entering Min Salary : " + salaryMin1.toString());
        sendTextToElement(salaryMin1,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        CustomListeners.test.log(Status.PASS,"Entering Max Salary : " + salaryMax1.toString());
        sendTextToElement(salaryMax1,maxSalary);
    }
    public void selectSalaryType(String sType){
        CustomListeners.test.log(Status.PASS,"Selecting Salary Type : " + sType);
        selectByVisibleTextFromDropDown(salaryTypeDropDown1,sType);
    }
    public void selectJobType(String jType){
        CustomListeners.test.log(Status.PASS,"Selecting Job Type : " + jType);
        selectByVisibleTextFromDropDown(jobTypeDropDown1,jType);
    }
    public void clickOnFindJobButton(){
        CustomListeners.test.log(Status.PASS,"Clicking on Find Job Button : " + findJobBtn.toString());
        clickOnElement(findJobBtn);
    }

}
