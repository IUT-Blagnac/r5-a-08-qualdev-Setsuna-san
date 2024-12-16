package dojo;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {

    private Order order;

    @Given("{string} who wants to buy a drink")
    public void romeo_want_a_drink(String from) {
        order = new Order();
        order.declareOwner(from);
    }

    @When("an order is declared for {string}")
    public void order_is_declared(String to) {
        order.declareTarget(to);

    }

    @Then("there is {int} cocktail(s) in the order")
    public void there_is_no_cocktail(int nbCocktails) {
        order.addCocktails(nbCocktails);
        ArrayList<String> cocktails = order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }

    @And("a message saying {string} is added")
    public void a_message_is_added(String message) {
        order.declareMessage(message);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String expected) {
        String message = order.readMessage();
        assertEquals(expected, message);
    }

   
}
