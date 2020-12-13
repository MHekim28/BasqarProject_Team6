package StepDefinitions;

import Pages.Yusuf_Pages.LeftNav;
import Pages.Yusuf_Pages.DialogContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class US_08_Item_Categories_Page {

    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();

    @And("^Create a new UserType Choice Administrator$")
    public void createANewUserTypeChoiceAdministrator() {

        dialogContent.selectSubject("Administrator");

    }

    @And("^Create a new UserType Choice Student$")
    public void createANewUserTypeChoiceStudent() {

        dialogContent.selectSubject("Student");

    }

    @And("^Navigate a new Subject create and save$")
    public void navigateANewSubjectcreateAndSave(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Create a new Subject send Keys$")
    public void createANewSubjectSendKeys(DataTable elements) {
        List< List<String> >  elementsNameAndValue = elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^new Subject  click function$")
    public void newSubjectClickFunction(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }


    @And("^Navigate to Education Left page$")
    public void navigateToEducationLeftPage(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Navigate a new Subject Category and save$")
    public void navigateANewSubjectCategoryAndSave(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Create a new Subject Category$")
    public void createANewSubjectCategory(DataTable elements) {
        List< List<String> >  elementsNameAndValue = elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^Delete Subject Categories$")
    public void deleteSubjectCategories(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {


            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
}
