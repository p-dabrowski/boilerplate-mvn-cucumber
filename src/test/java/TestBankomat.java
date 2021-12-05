import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestBankomat {

    @Test
    public void testWplaty() {
        int kwota = 500;

        Bankomat bankomat = new Bankomat();

        bankomat.wplataPieniedzy(kwota);
        assertTrue( bankomat.pobierzSaldo() == 500, "Saldo różne od: " + kwota);
    }

    @Test
    public void testWyplaty() throws Exception {
        int kwota = 500;
        int kwotaWyplaty = 200;

        Bankomat bankomat = new Bankomat();
        bankomat.wplataPieniedzy(kwota);
        bankomat.wyplataPieniedzy(kwotaWyplaty);
        assertTrue( bankomat.pobierzSaldo() == 300, "Saldo różne od: " + kwota);
    }
}
