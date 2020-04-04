package dealTypeTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class DealTypeCreationPositiveSmokeTest extends AbstractParentTest {

    @Test
    public void dealTypeCreationPositive(){
        loginPage.openPage();
        loginPage.loginToPage("Student", "909090");
        homePage.clickOnDictionaryMenuOpenButton();
        dealTypePage.clickOnDealTypeMenu();
        dealTypePage.clickOnPlusButton();
        dealTypePage.insertDealTypeName("Great Deal");
        dealTypePage.clickOnCreationButtom();
    }
}
