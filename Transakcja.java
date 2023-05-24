/**
 * Klasa abstrakcyjna Transakcja.
 * Posiada pola potrzebne takze do realnej transakcji bankowej.
 */
public class Transakcja {
    String dataPrzelewu;
    String nazwaOdbiorcy;
    String nrRachunkuOdbiorcy;      //32 znaki razem z przerwami (AA AAAA AAAA AAAA AAAA AAAA AAAA)
    int kwota;
    String nrRachunkuZleceniodawcy;
    String nazwaZleceniodawcy;
    String tytul;

    protected Transakcja(String dataPrzelewu, String nazwaOdbiorcy, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String nazwaZleceniodawcy, String tytul) {
        char pierwsza_kropka = dataPrzelewu.charAt(2), druga_kropka = dataPrzelewu.charAt(5);
        for(int i=0; i<10; i++) {
            if(i == 2 || i == 5) {
                if(!((pierwsza_kropka == '.') || (druga_kropka == '.')))
                    throw new IllegalArgumentException("Format daty to \"DD.MM.RRRR\"");
            }
            else if(dataPrzelewu.charAt(i) < 48 || dataPrzelewu.charAt(i) > 57)
                System.out.println("Data sklada sie z cyfr");
        }

        for(int i=0; i<nrRachunkuOdbiorcy.length(); i++) {
            if(nrRachunkuOdbiorcy.charAt(i) < 48 || nrRachunkuOdbiorcy.charAt(i) > 57 || nrRachunkuOdbiorcy.charAt(i) != 32)
                throw new IllegalArgumentException("Nr rachunku sklada sie z samych cyfr przedzielonych spacjami");
        }
        try {
            if (nrRachunkuOdbiorcy.length() == 26)
                throw new DivideBySpacesException("Bez spacji");
        }
        catch (DivideBySpacesException ds) {
            nrRachunkuOdbiorcy = nrRachunkuOdbiorcy.substring(0, 2) + " " + nrRachunkuOdbiorcy.substring(2, 4) + " " + nrRachunkuOdbiorcy.substring(6, 4) + " " +
                    nrRachunkuOdbiorcy.substring(10, 4) + " " + nrRachunkuOdbiorcy.substring(14, 4) + " " + nrRachunkuOdbiorcy.substring(18, 4) + " " + nrRachunkuOdbiorcy.substring(22, 4);
        }

        for(int i=0; i<nrRachunkuZleceniodawcy.length(); i++) {
            if(nrRachunkuZleceniodawcy.charAt(i) < 48 || nrRachunkuZleceniodawcy.charAt(i) > 57 || nrRachunkuZleceniodawcy.charAt(i) != 32)
                throw new IllegalArgumentException("Nr rachunku sklada sie z samych cyfr przedzielonych spacjami");
        }
        try {
            if (nrRachunkuZleceniodawcy.length() == 26)
                throw new DivideBySpacesException("Bez spacji");
        }
        catch (DivideBySpacesException ds) {
            nrRachunkuZleceniodawcy = nrRachunkuZleceniodawcy.substring(0, 2) + " " + nrRachunkuZleceniodawcy.substring(2, 4) + " " + nrRachunkuZleceniodawcy.substring(6, 4) + " " +
                    nrRachunkuZleceniodawcy.substring(10, 4) + " " + nrRachunkuZleceniodawcy.substring(14, 4) + " " + nrRachunkuZleceniodawcy.substring(18, 4) + " " +
                    nrRachunkuZleceniodawcy.substring(22, 4);
        }


        this.dataPrzelewu = dataPrzelewu;
        this.nazwaOdbiorcy = nazwaOdbiorcy;
        this.nrRachunkuOdbiorcy = nrRachunkuOdbiorcy;
        this.kwota = kwota;
        this.nrRachunkuZleceniodawcy = nrRachunkuZleceniodawcy;
        this.nazwaZleceniodawcy = nazwaZleceniodawcy;
        this.tytul = tytul;
    }

    protected Transakcja(String dataPrzelewu, String nrRachunkuOdbiorcy, int kwota, String nrRachunkuZleceniodawcy, String tytul) {
        char pierwsza_kropka = dataPrzelewu.charAt(2), druga_kropka = dataPrzelewu.charAt(5);
        for(int i=0; i<10; i++) {
            if(i == 2 || i == 5) {
                if(!((pierwsza_kropka == '.') || (druga_kropka == '.')))
                    throw new IllegalArgumentException("Format daty to \"DD.MM.RRRR\"");
            }
            else if(dataPrzelewu.charAt(i) < 48 || dataPrzelewu.charAt(i) > 57)
                System.out.println("Data sklada sie z cyfr");
        }

        this.dataPrzelewu = dataPrzelewu;
        this.nrRachunkuOdbiorcy = nrRachunkuOdbiorcy;
        this.kwota = kwota;
        this.nrRachunkuZleceniodawcy = nrRachunkuZleceniodawcy;
        this.tytul = tytul;
    }

    public String toString() {
        return getClass() + ": data przelewu " + dataPrzelewu + ", kwota " + kwota + ", tytul " + tytul + "\n";
    }
}
