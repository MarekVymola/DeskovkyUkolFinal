import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NactiSoubor {

    private static List<Deskovka> list = new ArrayList<>();

    protected static List<Deskovka> vypisSoubor(String nazevSouboru, String oddelovac) {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(nazevSouboru)));
            while (sc.hasNextLine()) {
                String radek = sc.nextLine();
                String[] polozka = radek.split(oddelovac);
                String nazev = polozka[0];
                Boolean koupeno = Boolean.parseBoolean(polozka[1]);
                int oblibenost = Integer.parseInt(polozka[2]);
                list.add(new Deskovka(nazev, koupeno, oblibenost));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return new ArrayList<>(list);
    }

    public List<Deskovka> pocetSouboru() {
        list.size();
        return new ArrayList<>(list);
    }
}