package Pages.DavutPackage;

import Pages.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
public LeftNav(){
    PageFactory.initElements(driver,this);
}
//findby locatorlar buraya yazilacak
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
        private WebElement setupOne;
    @FindBy(xpath = "//span[text()='Parameters']")
        private WebElement parameters;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;


    WebElement myElement;
public void findElementAndClickFunction(String elementName){
    switch (elementName){
        case "setupOne":
            myElement=setupOne;
            break;
        case "parameters":
            myElement=parameters;
            break;
        case "fees":
            myElement=fees;
            break;




    }
    clickFunction(myElement);

}
}
