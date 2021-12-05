public class Bankomat {
    private int saldo = 0;

    public void wplataPieniedzy(int  wplata) {
        if (wplata > 0) { saldo += wplata; }
        else {
            System.out.println("Zbyt niska kwota wpłaty");
        }
    }

    public void wyplataPieniedzy(int wyplata) throws Exception {
        if (wyplata <= saldo) { saldo -= wyplata; }
        else {
            System.out.println("Zbyt mało środków na koncie");
            throw new Exception("Zbyt malo srodkow");
        }
    }

    public void pokazSaldo() {
        System.out.println("Stan konta: " + saldo);
    }

    public int pobierzSaldo() {
        return saldo;
    }
}
