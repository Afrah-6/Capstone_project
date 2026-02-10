package stepdefinitions;

import Pages.ContactusPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class contactus {

    // Instantiating the Page Object class
    ContactusPage contactPage = new ContactusPage();

    @Given("I am on the BooksWagon homepage")
    public void i_am_on_the_books_wagon_homepage() {
        contactPage.homeP();
    }

    @When("I click on the Contact Us link")
    public void i_click_on_the_contact_us_link() {
        contactPage.clickcontactus();
    }

    @And("I enter {string} in the name field")
    public void i_enter_in_the_name_field(String name) {
        contactPage.entername_feild(name);
    }

    @And("I enter {string} in the email field")
    public void i_enter_in_the_email_field(String email) {
        contactPage.enteremail_field(email);
    }

    @And("I enter {string} in the address field")
    public void i_enter_in_the_address_field(String address) {
        contactPage.enteraddress_field(address);
    }

    @And("I enter {string} in the phone field")
    public void i_enter_in_the_phone_field(String phone) {
        contactPage.enterphone_field(phone);
    }

    @And("I enter {string} in the subject field")
    public void i_enter_in_the_subject_field(String subject) {
        contactPage.entersubject_field(subject);
    }

    @And("I select {string} from the subject type dropdown")
    public void i_select_from_the_subject_type_dropdown(String type) {
        // Note: Your method currently has "Courier Related" hardcoded
        contactPage.selectdrpdown();
    }

    @And("I enter {string} in the description field")
    public void i_enter_in_the_description_field(String description) {
        contactPage.enterdescription_field(description);
    }
}
