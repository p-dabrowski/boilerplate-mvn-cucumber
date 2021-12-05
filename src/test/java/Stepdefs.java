import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Stepdefs {
    Bankomat bankomat = new Bankomat();

    @Given("Mam na koncie {int} zlotych")
    public void mam_na_koncie_zlotych(Integer int1) {
        bankomat.wplataPieniedzy(int1);
    }
    @When("Wplatam {int} zlotych")
    public void wplatam_zlotych(Integer int1) {
        bankomat.wplataPieniedzy(int1);
    }
    @Then("Mam {int} zlotych")
    public void mam_zlotych(Integer int1) {
        assertTrue(bankomat.pobierzSaldo() == int1, "Blad salda");
    }
}


