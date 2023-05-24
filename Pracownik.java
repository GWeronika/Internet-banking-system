/**
 * Pracownik jest klasa abstrakcyjna.
 * Posiada 5 pol: imie, nazwisko, PESEL, login i haslo.
 */
public abstract class Pracownik {
    String imie;
    String nazwisko;
    String PESEL;
    String login;
    String haslo;

    protected Pracownik (String imie, String nazwisko, String PESEL, String login, String haslo) {
        for(int i = 0; i < imie.length(); i++) {
            if((imie.charAt(i) < 65 || imie.charAt(i) > 90) && (imie.charAt(i) < 97 || imie.charAt(i) > 122))
                throw new IllegalArgumentException("Imie musi skladac sie z liter");
        }

        for(int i = 0; i < nazwisko.length(); i++) {
            if((nazwisko.charAt(i) < 65 || nazwisko.charAt(i) > 90) && (nazwisko.charAt(i) < 97 || nazwisko.charAt(i) > 122))
                throw new IllegalArgumentException("Nazwisko musi skladac sie z liter");
        }

        try {
            if (imie.charAt(0) < 65 || imie.charAt(0) > 90)
                throw new IllegalCapsLockException("Imie zaczyna sie z wielkiej litery");
        }
        catch (IllegalCapsLockException cl) {
            imie = imie.substring(0, 1).toUpperCase() + imie.substring(1);
        }

        try {
            if (nazwisko.charAt(0) < 65 || nazwisko.charAt(0) > 90)
                throw new IllegalCapsLockException("Nazwisko zaczyna sie z wielkiej litery");
        }
        catch (IllegalCapsLockException cl) {
            nazwisko = nazwisko.substring(0, 1).toUpperCase() + nazwisko.substring(1);
        }

        if(PESEL.length() != 11)
            throw new IllegalArgumentException("PESEL sklada sie z 11 cyfr");       //tego wyjatku nie da sie obsluzyc
        for(int i = 0; i < 11; i++) {
            if(PESEL.charAt(i) < 48 || PESEL.charAt(i) > 57)
                throw new IllegalArgumentException("PESEL sklada sie tylko z cyfr");
        }

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
        this.login = login;
        this.haslo = haslo;
    }

    public String toString() {
        return getClass() + ": " + imie + " " + nazwisko + "\n";
    }

}
