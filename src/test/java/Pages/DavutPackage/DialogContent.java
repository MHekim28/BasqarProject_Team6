package Pages.DavutPackage;

import Pages.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement>goItBtns;
    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addButton;
    @FindBy(xpath = "(//input[@matinput])[1]")
    private WebElement erstSearchName;
    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement SearchBtn;
    @FindBy(xpath = "ms-table#ms-table-6 > div > table > tbody > tr > td:nth-of-type(2)")
    private WebElement Searchsnc;
    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    private List<WebElement>nameList;
    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    private List<WebElement>deleteButtonList;
    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement>editButtonList;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    public List<WebElement> userTypeAllOptions;
    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesBtn;

    WebElement myElement;

    List<WebElement> myElementList=new ArrayList<>();

    public List<WebElement> findWebElementList(String webElementListName) {
        switch (webElementListName) {

            case "deleteButtonList":
                myElementList = deleteButtonList;

            case "nameList":
                myElementList = nameList;
                break;
        }
        return myElementList;
    }

    //mothod bitisi
    public void findElementAndClickFunction(String ElementName) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "addButton":
                myElement = addButton;
                break;
            case "yesBtn":
                myElement = yesBtn;
                break;


        }
        clickFunction(myElement);
    }

        public void findElementAndSendKeysFunction (String ElementName, String value){
            /**
             * Buraya tıklanacak butonun adı gönderilecek
             * Burada adından hangi eleman olduğu bulunuyor
             * ve sonra tıklanıyor.
             */
//            List<WebElement> itemNameList = driver.findElements(By.xpath("//span[text()='Add to Cart']"));
//            itemNameList.get(0).click();//incelenecek

            switch (ElementName) {



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
        }

        verifyElementContainsText(myElement, msg);
    }

    public void searchText(String elementName,String text ) {
        switch (elementName) {
            case "erstSearchName":
                myElement = erstSearchName;
                break;
        }
        sendKeysFunction(myElement, text);
        clickFunction(SearchBtn);
    }


    public void editAndDeleteFunction(String Name, String editOrDelete) {

       if (msjContainers.size()>0) {
           if (msjContainer.isDisplayed())
               wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
       }

       WebElement e;
        searchText("erstSearchName",Name);

        if (editOrDelete.equalsIgnoreCase("delete")) {

            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-delete-button>button"),1));
            e= driver.findElement(By.cssSelector("ms-delete-button>button"));
        }else{


             wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("ms-edit-button>button"),1));
             e= driver.findElement(By.cssSelector("ms-edit-button>button"));

        }
        clickFunction(e);
    }


    public void selectUserType(String userType) {

        for (WebElement n : userTypeAllOptions) {
            if (n.getText().contains(userType)) {
                clickFunction(n);
                break;
            }
        }
    }

}
