package StepDefinitions;

import Pages.DavutPackage.DialogContent;
import Pages.DavutPackage.FormContent;
import Pages.DavutPackage.LeftNav;
import Pages.Parent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class US_03_FeesPageSteps extends Parent {

   LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    @And("^Navigate to Fess page$")
    public void navigateToFessPage() {

        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("fees");
    }

    @When("^User create Fess with ApachePOI$")
    public void userCreateFessWithApachePOI() {

     List<List<String>> liste=ExcelUtility.getListData("src/test/java/Pages/DavutPackage/exceldosya.xlsx","new",4);

        System.out.println("liste = " + liste);

        for (int i = 0; i < liste.size() ; i++) {

            dialogContent.findElementAndClickFunction("addButton");
            formContent.findElementAndSendKeysFunction("formName",liste.get(i).get(0));
            formContent.findElementAndSendKeysFunction("formCode",liste.get(i).get(1));
            formContent.findElementAndSendKeysFunction("formIntegrationCode",liste.get(i).get(2));
            formContent.findElementAndSendKeysFunction("formpriority",liste.get(i).get(3));
            formContent.findElementAndClickFunction("formSaveButton");
        }

    }

    @Then("^User edit Fess with ApachePOI$")
    public void userEditFessWithApachePOI() {
        List<List<String>> liste= ExcelUtility.getListData("src/test/java/Pages/DavutPackage/exceldosya.xlsx","edit",5);
        System.out.println("liste = " + liste);
            
        for (int i = 0; i <liste.size() ; i++) {

            dialogContent.editAndDeleteFunction(liste.get(i).get(0),"edit");
            formContent.findElementAndSendKeysFunction("formName",liste.get(i).get(1));
            formContent.findElementAndSendKeysFunction("formCode",liste.get(i).get(2));
            formContent.findElementAndSendKeysFunction("formIntegrationCode",liste.get(i).get(3));
            formContent.findElementAndSendKeysFunction("formpriority",liste.get(i).get(4));
            formContent.findElementAndClickFunction("formSaveButton");


                }
            }

    @When("^User delete Fess with ApachePOI$")
    public void userDeleteFessWithApachePOI() {
        List<List<String>> liste= ExcelUtility.getListData("src/test/java/Pages/DavutPackage/exceldosya.xlsx","delete",1);


        for (int i = 0; i <liste.size() ; i++) {

            dialogContent.editAndDeleteFunction(liste.get(i).get(0),"delete");

            dialogContent.findElementAndClickFunction("yesBtn");


        }
    }
}
