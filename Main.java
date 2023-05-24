public class Main {
    public static void main(String[] args) {
        //stworzenie obiektu banku
        BankInternetowy bank = new BankInternetowy("Bank Jagodka", "Chmielowa 2A", "9876543210L", 150000, "PLKMOIJ00001", "www.bankjagodka.pl");
        System.out.println("Witamy w banku " + bank.nazwaBanku);
        System.out.println();

        Kierownik kierownik = new Kierownik("Demi", "Moore", "11111198765", "dmoore_kierownik", "shTdjTG56d");
        bank.dodajPracownika(kierownik);
        System.out.println("Dzien dobry. Mam na imie " + kierownik.imie + " i jestem kierownikiem, tzn ze moge zwalniac i zatrudniac pracownikow");
        System.out.println("Zatrudniam Wladyslawa Lokietka");

        PracownikBOK pracownikBOK = kierownik.przyjmijB("Wladyslaw", "Lokietek", "a9111198765", "wladzio1939", "1234");
        bank.dodajPracownika(pracownikBOK);
        System.out.println();

        System.out.println("Dzien dobry. Mam na imie " + pracownikBOK.imie + " i jestem nowym pracownikiem Biura Obslugi Klienta");
        System.out.println("Musze zadzwonic do klienta");
        pracownikBOK.zadzwon();
        System.out.println();

        Klient klientBanku = new Klient("Papa", "Smerf", "66142778905", "MC 120384", "27.04.1966", "papasmerf@wioskasmerfow.smerf", "543765987", "papaSmerfnyMC", "przepis NA sok Z gumijagod");
        bank.dodajKlienta(klientBanku);
        System.out.println("Dzien dobry. Mam na imie " + klientBanku.imie + " " + klientBanku.nazwisko + " i jestem klientem banku " + bank.nazwaBanku);
        System.out.println("Ooo, dzwoni mi telefon 'drr' musze odebrac");
        klientBanku.odbierz();
        System.out.println();

        System.out.println("Chcialbym kupic piekarnie smerfa Lasucha. Musze wziac kredyt hipoteczny!");
        KredytHipoteczny kredytNaPiekarnie = new KredytHipoteczny(250000, "31 miesiecy", "12.06.2026", "zakup piekarni Lasucha", "23000");
        klientBanku.dodajKredyt(kredytNaPiekarnie);
        System.out.println("Kredyt hipoteczny wziety. Kwota: " + kredytNaPiekarnie.kwota + " Cel: " + kredytNaPiekarnie.cel);
        System.out.println();

        System.out.println("Teraz musze wyslac Lasuchowi przelew za piekarnie. Najlepiej bedzie przelewem. Niestety ma on konto w innym banku niz ja, wiec bedzie musial czekac");
        PrzelewZewnetrzny przelewDlaLasucha = new PrzelewZewnetrzny("12.05.2023", "12 1234 1234 1234 1234 1234 1234", 250000, "98 9876 9876 9876 9876 9876 9876", "Przelew za Piekarnie", PrzelewZewnetrzny.sesjaElixir.II);
        klientBanku.dodajTransakcje(przelewDlaLasucha);
        System.out.println("Potrzebne mi potwierdzenie, dlatego czekam na zatwierdzenie SMS.");
        klientBanku.potwierdzTransakcjeSMS();
        System.out.println();

        System.out.println("Pracownicy banku:");
        System.out.println(bank.pracownicyBanku);
        System.out.println();

        System.out.println("Klienci banku:");
        System.out.println(bank.klienciBanku);
        System.out.println();

        System.out.println("Transakcje klienta: " + klientBanku + ":");
        System.out.println(klientBanku.transakcjeKlienta);
        System.out.println();

        System.out.println("Kredyty klienta: " + klientBanku + ":");
        System.out.println(klientBanku.kredytyKlienta);
    }
}