package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DealTypePage extends ParentPage {

    @FindBy(xpath = ".//a[@href='/dictionary/deal_type']")
    private WebElement dealTypeMenu;

    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm']")
    private WebElement plusButtonAdd;

    @FindBy(id = "deal_type_dealTypeName")
    private WebElement dealTypeNameInputField;

    @FindBy(name = "add")
    private WebElement createButton;

    public DealTypePage(WebDriver webDriver) {
        super(webDriver);
    }



    public void clickOnDealTypeMenu(){
        actionWithWebElements.clickButton(dealTypeMenu);
    }

    public void clickOnPlusButton(){
        actionWithWebElements.clickButton(plusButtonAdd);
    }

    public void insertDealTypeName(String text){
        actionWithWebElements.enterTextToTextField(dealTypeNameInputField, text);
    }

    public void clickOnCreationButtom(){
        actionWithWebElements.clickButton(createButton);
    }


}
