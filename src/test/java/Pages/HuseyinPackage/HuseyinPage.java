package Pages.HuseyinPackage;

import Pages.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HuseyinPage extends Parent {

    WebElement myElement;

    public HuseyinPage() {
        PageFactory.initElements(driver, this);
        System.out.println("deneme");
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(css = "ms-add-button.ng-star-inserted")
    private WebElement btnAdd;


    @FindBy(css = "ms-text-field[formcontrolname='name']>input") // if input,find a input tag
    private WebElement inputName;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input") // if input,find a input tag
    private WebElement inputshortname;

    @FindBy(css = "ms-text-field[formcontrolname='order']>input")
    private WebElement inputOrder;

    @FindBy(css = "mat-select[id='mat-select-14']")
    private WebElement inputNextGrade;

    @FindBy(css = "ms-save-button>button")
    private WebElement btnSave;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")})
    public List<WebElement> nameList;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;

    @FindBy(xpath = " //span[text()=' Yes '] ")
    private WebElement btnYes;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement succesAlert;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement errorAlert;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "btnAdd":
                myElement = btnAdd;
                break;

            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "gradeLevels":
                myElement = gradeLevels;
                break;

            case "btnSave":
                myElement = btnSave;
                break;

            case "btnYes":
                myElement = btnYes;
                break;

        }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "inputName":
                myElement = inputName;
                break;

            case "inputshortname":
                myElement = inputshortname;
                break;

            case "inputOrder":
                myElement = inputOrder;
                break;

            case "inputNextGrade":
                myElement = inputNextGrade;
                break;

        }
        sendKeysFunction(myElement, value);
    }


    public void waitUntilNeed(String elementName) {

        switch (elementName) {

            case "btnAdd":
                myElement = btnAdd;
                break;
        }
        waitUntilClickable(myElement);
    }


    public void checkControl(String elementName, String Msg) {

        switch (elementName) {
            case "succesAlert":
                myElement = succesAlert;
                break;

            case "errorAlert":
                myElement = errorAlert;
                break;

        }
        wait.until(ExpectedConditions.textToBePresentInElement(myElement, Msg));
        Assert.assertTrue(myElement.getText().toLowerCase().contains(Msg.toLowerCase()));

    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {

        List<WebElement> btnList = new ArrayList<>();
        btnList = waitVisibleListAllElement(editButtonList);

        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);

        for (int i = 0; i < nameListNew.size(); i++) {
            if (nameListNew.get(i).getText().equalsIgnoreCase(countryName)) {
                clickFunction(btnList.get(i));
            }
        }
    }

    public void deleteFunction(String countryName, String editOrDelete) {

        List<WebElement> btnList = new ArrayList<>();

        btnList = waitVisibleListAllElement(deleteButtonList);

        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);

        for (int i = 0; i < nameListNew.size(); i++) {
            if (nameListNew.get(i).getText().equalsIgnoreCase(countryName)) {
                clickFunction(btnList.get(i));
            }
        }
        findElementAndClickFunction("btnYes");
    }

}