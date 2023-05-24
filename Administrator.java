/**
 * tworzy administratora systemu banku internetowego
 */
public class Administrator extends Pracownik {
    public Administrator (String imie, String nazwisko, String PESEL, String login, String haslo) {
        super(imie, nazwisko, PESEL, login, haslo);
    }
}
