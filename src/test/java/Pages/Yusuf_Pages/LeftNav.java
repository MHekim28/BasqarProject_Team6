package Pages.Yusuf_Pages;

import Pages.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement Inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupButtonUnderInventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;






    WebElement myElement;
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {


            case "Inventory":
                myElement = Inventory;
                break;

            case "setupButtonUnderInventory":
                myElement = setupButtonUnderInventory;
                break;

            case "ItemCategory":
                myElement = ItemCategory;
                break;


        }

        clickFunction(myElement);
    }
}
