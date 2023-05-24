/**
 * PracownikKredytowy dziedziczy po klasie abstrakcyjnej Pracownik
 */
public class PracownikKredytowy extends Pracownik {
    public PracownikKredytowy (String imie, String nazwisko, String PESEL, String login, String haslo) {
        super(imie, nazwisko, PESEL, login, haslo);
    }
}
