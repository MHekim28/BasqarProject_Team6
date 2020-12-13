package StepDefinitions;


import Pages.MustafaPages.MustafaPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class US_01_CitizenshipPageSteps {

   MustafaPage citizenship=new MustafaPage();

    @Given("^Navigate to Citizenhip Page$")
    public void navigateToCitizenhipPage(DataTable elements) {

        List<String > clickElements=elements.asList(String.class);
        for (int i = 0; i <clickElements.size() ; i++) {
           citizenship.findElementAndClickFunction(clickElements.get(i));
        }

    }

    @When("^Create a Citizenship$")
    public void createACitizenship(DataTable elements) {
        citizenship.waitUntilNeed("btnAdd");
        citizenship.findElementAndClickFunction("btnAdd");

        List<List<String >> sendKeysElements=elements.asLists(String.class);
        for (int i = 0; i <sendKeysElements.size() ; i++) {

            citizenship.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }
        citizenship.findElementAndClickFunction("btnSave");

    }

    @And("^Check  control whether succesfully message displayed$")
    public void checkControlWhetherSuccesfullyMessageDisplayed() {
        citizenship.checkControl("succesAlert","succes");

    }

    @And("^Edit the same Citizenship$")
    public void editTheSameCitizenship(DataTable elements) {

        citizenship.needToScroll("inputSearchName");

        List<List<String >> sendKeysElements=elements.asLists(String.class);

        int count=0;
        for (int i = 0; i <sendKeysElements.size() ; i++) {

            citizenship.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

            if(count==1){
                citizenship.findElementAndClickFunction("btnSearch");
                citizenship.waiting(500);
                citizenship.waitUntilNeed("editAfterSearch");
                citizenship.findElementAndClickFunction("editAfterSearch");
            }

            if(count==3){
                citizenship.findElementAndClickFunction("btnSave");
            }


            count++;
        }





    }

    @And("^Delete the edited Citizenship$")
    public void deleteTheEditedCitizenship(DataTable elements) {

        citizenship.needToScroll("inputSearchName");

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {

            citizenship.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

        }
        citizenship.findElementAndClickFunction("btnSearch");
        citizenship.waiting(500);
        citizenship.waitUntilNeed("afterSearchDelete");
        citizenship.findElementAndClickFunction("afterSearchDelete");
        citizenship.findElementAndClickFunction("btnYes");

    }
}
