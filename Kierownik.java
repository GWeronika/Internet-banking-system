/**
 * Klasa Kierownik dziedziczy po klasie abstrakcyjnej Pracownik.
 * Znajduja sie tu cztery funkcje dwoch rodzajow:
 *      zwolnij pracownika - obiekt staje sie obiektem pustym,
 *      przyjmij pracownika - funkcja tworzy nowy obiekt o podanych w argumentach metody atrybutach.
 */
public class Kierownik extends Pracownik {
    public Kierownik (String imie, String nazwisko, String PESEL, String login, String haslo) {
        super(imie, nazwisko, PESEL, login, haslo);
    }

    void zwolnijPracownikaBOK(PracownikBOK pracownikB) {
        pracownikB = null;
    }
    void zwolnijPracownikaKredytowego(PracownikKredytowy pracownikK) {
        pracownikK = null;
    }

    PracownikBOK przyjmijB(String imie, String nazwisko, String PESEL, String login, String haslo) {
        PracownikBOK nowypracownikB = new PracownikBOK(imie, nazwisko, PESEL, login, haslo);
        return nowypracownikB;
    }
    PracownikKredytowy przyjmijK(String imie, String nazwisko, String PESEL, String login, String haslo) {
        PracownikKredytowy nowypracownikK = new PracownikKredytowy(imie, nazwisko, PESEL, login, haslo);
        return nowypracownikK;
    }
}
