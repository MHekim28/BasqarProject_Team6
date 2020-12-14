package Pages.MalikPages;

import Pages.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MalikPage extends Parent {
    WebElement myElement;

    public MalikPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[text()='Messaging']")
    private WebElement messagingButton;

    @FindBy(xpath = "//span[text()='Notifications']")
    private WebElement notificationsButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//mat-form-field//input")
    private WebElement dialogInput1;

    @FindBy(xpath = "//mat-select/div")
    private WebElement typeSelectBtn;

    @FindBy(css = "textarea[formcontrolname='description']")
    private WebElement notifDecription;

    @FindBy(xpath = "(//div[@role='tab'])[1]")
    private WebElement tabSMS;

    @FindBy(xpath = "(//div[@role='tab'])[2]")
    private WebElement tabEmail;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement option1;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement option2;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement option3;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement option4;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-table//td)[2]")
    public WebElement searchResult;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement editButton;




    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "messagingButton":
                myElement=messagingButton;
                break;

            case "notificationsButton":
                myElement=notificationsButton;
                break;

            case "addButton":
                myElement=addButton;
                break;

            case "typeSelectBtn":
                myElement=typeSelectBtn;
                break;

            case "tabSMS":
                myElement=tabSMS;
                break;

            case "tabEmail":
                myElement=tabEmail;
                break;

            case "saveButton":
                myElement=saveButton;
                break;

            case "option1":
                myElement=option1;
                break;

            case "option2":
                myElement=option1;
                break;

            case "option3":
                myElement=option1;
                break;

            case "option4":
                myElement=option1;
                break;

            case "searchButton":
                myElement=searchButton;
                break;

            case "deleteButton":
                myElement=deleteButton;
                break;

            case "yesButton":
                myElement=yesButton;
                break;

            case "editButton":
                myElement=editButton;
                break;


        }
        clickFunction(myElement);
    }
    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {
            case "dialogInput1":
                myElement=dialogInput1;
                break;

            case "notifDecription":
                myElement=notifDecription;
                break;


        }
        sendKeysFunction(myElement, value);
    }
    public void elementMustBeClickable(String elementName){
        switch (elementName){

            case "deleteButton":
                myElement=deleteButton;
                break;

            case "editButton":
                myElement=editButton;
                break;
        }
        waitUntilVisible(myElement);
    }

}

