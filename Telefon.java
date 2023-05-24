/**
 * Interfejs telefon posiada trzy funkcje przydatne podczas kontaktow na linii klient-pracownik
 * Jego metody implementuja klasy Klient i PracownikBOK
 */
public interface Telefon {
    void odbierz();
    void zadzwon();
    void potwierdzTransakcjeSMS();
}
