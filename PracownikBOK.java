/**
 * PracownikBOK dziedziczy po klasie abstrakcyjnej Pracownik
 * Nadpisuje takze trzy funkcje z interfejsu Telefon
 */
public class PracownikBOK extends Pracownik implements Telefon {
    public PracownikBOK (String imie, String nazwisko, String PESEL, String login, String haslo) {
        super(imie, nazwisko, PESEL, login, haslo);
    }
    @Override
    public void odbierz() {
        System.out.println("Dzien dobry. Tutaj bank internetowy. W czym moge sluzyc?");
    }
    @Override
    public void zadzwon() {
        System.out.println("Dzien dobry. Bank internetowy z tej strony. Mielibysmy do Panstwa pewna sprawe.");
    }

    @Override
    public void potwierdzTransakcjeSMS() {
        System.out.println("Potwierdzam zgodnosc transakcji.");
    }
}
