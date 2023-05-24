import java.util.ArrayList;

/**
 * na podstawie klasy mozna tworzyc banki, w ktorych system bankowosci internetowej sie odbywa
 */
public class BankInternetowy {
    String nazwaBanku;
    String adres;
    String KRS;
    int kapitalWlasny;
    String ISIN;
    String domena;

    ArrayList<Klient> klienciBanku = new ArrayList<>();
    ArrayList<Pracownik> pracownicyBanku = new ArrayList<>();

    public BankInternetowy(String nazwaBanku, String adres, String KRS, int kapitalWlasny, String ISIN, String domena) {
        this.nazwaBanku = nazwaBanku;
        this.adres = adres;
        this.KRS = KRS;
        this.domena = domena;
        this.kapitalWlasny = kapitalWlasny;
        this.ISIN = ISIN;
    }

    public void dodajKlienta(Klient nowyKlient) {
        klienciBanku.add(nowyKlient);
    }
    public void dodajPracownika(Pracownik nowyPracownik) {
        pracownicyBanku.add(nowyPracownik);
    }
}
