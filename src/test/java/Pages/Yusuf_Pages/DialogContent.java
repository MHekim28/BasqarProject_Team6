package Pages.Yusuf_Pages;

import Pages.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent() {
        PageFactory.initElements(driver, this);
    }



    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;


    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;


    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })

    public List<WebElement> userTypeAllOptions;


    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon'])[5]")
    private WebElement ItemCategoriesEditButton;

    @FindAll({
            @FindBy(css = "mat-option[id^='mat-option-']")
    })
    private List<WebElement> subjectCategory;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement ItemCategoriesNameInputSearch;

    @FindBy(xpath = "//td[text()='Yusuf_Java']")
    private WebElement nameShouldBeSeen;

    @FindBy(xpath = "//mat-icon[text()='cancel']")
    private WebElement ItemCategoriesCancelButton;




    public void findElementAndClickFunction(String ElementName) {


        switch (ElementName) {


            case "ItemCategoriesEditButton":
                myElement = ItemCategoriesEditButton;
                break;


            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":

                if (gotItBtns.size() == 0)
                    return;

                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "userTypeDropdown":
                myElement = userTypeDropdown;
                break;

            case "ItemCategoriesCancelButton":
                myElement = ItemCategoriesCancelButton;
                break;



        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {


            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "ItemCategoriesNameInputSearch":
                myElement = ItemCategoriesNameInputSearch;
                break;


        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {

            case "msjContainer":
                myElement = msjContainer;
                break;

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;

                case "nameShouldBeSeen":
                myElement = nameShouldBeSeen;
                break;
        }

        verifyElementContainsText(myElement, msg);
    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {

        // invisible olma beklemesini, display ise şartına bağladık, yani
        // gözüküyorsa kaybolana kadar bekle.

        if (msjContainers.size() > 0) {
            if (msjContainer.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
        }
    }


    public void selectSubject(String userType) {

        for (WebElement m : subjectCategory) {
            if (m.getText().contains(userType)) {
                clickFunction(m);
                break;
            }
        }
    }

}
