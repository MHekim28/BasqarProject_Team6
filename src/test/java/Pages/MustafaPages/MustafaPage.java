package Pages.MustafaPages;

import Pages.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MustafaPage extends Parent {

    WebElement myElement;

    public MustafaPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenships;

    @FindBy(css = "ms-add-button.ng-star-inserted")
    private WebElement btnAdd;



    @FindBy(css = "ms-text-field[formcontrolname='name']>input") // if input,find a input tag
    private WebElement inputName;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input") // if input,find a input tag
    private WebElement inputshortname;

    @FindBy(css = "ms-save-button>button")
    private WebElement btnSave;



    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement inputSearchName;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement inputSearchShrtNam;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement btnSearch;

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement editAfterSearch;


    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']/button)[1]")
    private WebElement afterSearchDelete;

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

            case "afterSearchDelete":
                myElement = afterSearchDelete;
                break;

            case "editAfterSearch":
                myElement = editAfterSearch;
                break;

            case "btnSearch":
                myElement = btnSearch;
                break;

            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "citizenships":
                myElement = citizenships;
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


    public void findElementAndSendKeysFunction(String elementName,String value) {

        switch (elementName) {

            case "inputName":
                myElement = inputName;
                break;

            case "inputshortname":
                myElement = inputshortname;
                break;


            case "inputSearchName":
                myElement = inputSearchName;
                break;

            case "inputSearchShrtNam":
                myElement = inputSearchShrtNam;
                break;


        }
       sendKeysFunction(myElement,value);
    }















    public void waitUntilNeed(String elementName){

        switch (elementName){
            case "afterSearchDelete":
                myElement=afterSearchDelete;
                break;

            case "editAfterSearch":
                myElement=editAfterSearch;
                break;

            case "btnAdd":
                myElement=btnAdd;
                break;

        }

        waitUntilVisible(myElement);
    }



    public  void needToScroll(String elementName) {

        switch (elementName) {
            case "inputSearchName":
                myElement=inputSearchName;
                break;


        }
        scrollToElement(myElement);
    }









    public void checkControl(String elementName,String Msg){

        switch (elementName){
            case "succesAlert":
                myElement=succesAlert;
                break;

            case "errorAlert" :
                myElement=errorAlert;
                break;

        }
        wait.until(ExpectedConditions.textToBePresentInElement(myElement,Msg));
        Assert.assertTrue(myElement.getText().toLowerCase().contains(Msg.toLowerCase()));



    }
}
