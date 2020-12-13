package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Parent {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    WebElement myElement;

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(xpath = "//div[contains(text(),'Invalid')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement errorAlert;

    @FindBy(xpath = "//h3[text()='  Dashboard ']")
    public WebElement dashboardText;

    @FindBy(id = "toast-container")
    private WebElement successMessage;

    public void login(String usernameStr, String passwordStr) {
        sendKeysFunction(username, usernameStr);
        sendKeysFunction(password, passwordStr);
        clickFunction(loginButton);

       // clickFunction(gotItBtn);


    }

    public void goToPage() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void checkTheMessage(String ElementName, String message) {
        switch (ElementName) {
            case "errorMessage":
                myElement = errorMessage;
                break;

            case "errorAlert":
                myElement = errorAlert;
                break;

            case "successMessage":
                myElement = successMessage;
                break;
        }

        verifyElementContainsText(myElement, message);
    }
}


