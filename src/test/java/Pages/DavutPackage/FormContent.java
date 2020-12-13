package Pages.DavutPackage;

import Pages.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    WebElement myElement;
    private String elementName;
    private String value;

    public FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-table-toolbar//button")
    private WebElement formAddButton;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement formSaveButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement formName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement formCode;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement formIntegrationCode;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']//input")
    private WebElement formpriority;

    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {

            case "formAddButton":
                myElement = formAddButton;
                break;
            case "formSaveButton":
                myElement = formSaveButton;
                break;

                }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName,String value)
    {

        switch (elementName)
        {
            case "formName":
                myElement = formName;
                break;
            case "formCode":
                myElement = formCode;
                break;
            case "formIntegrationCode":
                myElement = formIntegrationCode;
                break;
            case "formpriority":
                myElement = formpriority;
                break;

        }
        sendKeysFunction(myElement,value);
    }

}
