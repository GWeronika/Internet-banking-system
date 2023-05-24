import java.util.ArrayList;

/**
 * Klasa Klient implementuje interfejs Telefon.
 * Nadpisuje metody dzwonienia i odbierania wiadomosci a takze potwierdzania transakcji wiadomoscia SMS.
 */
public class Klient implements Telefon {
    String imie;
    String nazwisko;
    String PESEL;
    String nrDowodu;
    String dataUrodzin;
    String adresEmail;
    String nrTelefonu;
    String login;
    String haslo;
    ArrayList<Transakcja> transakcjeKlienta = new ArrayList<>();
    ArrayList<Kredyt> kredytyKlienta = new ArrayList<>();

    public Klient(String imie, String nazwisko, String PESEL, String nrDowodu, String data, String email, String telefon, String login, String haslo) {
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

        char pierwsza_kropka = data.charAt(2), druga_kropka = data.charAt(5);
        for(int i=0; i<10; i++) {
            if(i == 2 || i == 5) {
                if(!((pierwsza_kropka == '.') || (druga_kropka == '.')))
                    throw new IllegalArgumentException("Format daty to \"DD.MM.RRRR\"");
            }
            else if(data.charAt(i) < 48 || data.charAt(i) > 57)
                System.out.println("Data sklada sie z cyfr");
        }

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
        this.nrDowodu = nrDowodu;
        this.dataUrodzin = data;
        this.adresEmail = email;
        this.nrTelefonu = telefon;
        this.login = login;
        this.haslo = haslo;
    }

    @Override
    public void odbierz() {
        System.out.println("Dzien dobry. Chodzi o moje konto, tak?");
    }
    @Override
    public void zadzwon() {
        System.out.println("Dzien dobry. Dzwonie w sprawie mojego konta.");
    }

    @Override
    public void potwierdzTransakcjeSMS() {
        System.out.println("Zgodnosc transakcji potwierdzona.");
    }

    public String toString() {
        return this.imie + " " + this.nazwisko + "\n";
    }

    public void dodajTransakcje(Transakcja nowaTransakcja) {
        transakcjeKlienta.add(nowaTransakcja);
    }
    public void dodajKredyt(Kredyt nowyKredyt) {
        kredytyKlienta.add(nowyKredyt);
    }
}
