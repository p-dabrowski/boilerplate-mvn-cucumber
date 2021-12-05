import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Stepdefs {
    Bankomat bankomat = new Bankomat();
    Exception e;

    @Given("Mam na koncie {int} zlotych")
    public void mam_na_koncie_zlotych(Integer int1) {
        bankomat.wplataPieniedzy(int1);
    }
    @When("Wplacam {int} zlotych")
    public void wplacam_zlotych(Integer int1) {
        bankomat.wplataPieniedzy(int1);
    }
    @When("Wyplacam {int} zlotych")
    public void wyplacam_zlotych(Integer int1) throws Exception {
        try {
            bankomat.wyplataPieniedzy(int1);
        } catch(Exception thrownException) {
            e = thrownException;
        }
    }
    @Then("Mam {int} zlotych")
    public void mam_zlotych(Integer int1) {
        assertTrue(bankomat.pobierzSaldo() == int1, "Blad salda");
    }

    @Then("Zostal rzucony wyjatek")
    public void zostalRzuconyWyjatek() {
        assertTrue(e != null, "Wyjatek nie rzucony");
    }
}


