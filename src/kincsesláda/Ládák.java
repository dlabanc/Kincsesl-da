package kincsesláda;

import java.util.Scanner;

public class Ládák {

    String ladak[] = {"1: Arany láda", "2: Ezüst láda", "3: Bronz láda"};
    String ladakszoveg[] = {"Bennem van a kincs", "Nem bennem van a kincs", "Az arany láda hazudik"};
    Scanner scn = new Scanner(System.in);

    public void jatek() {
        kiirat();
        kerdes();
        if (valasztas() == true) {
            System.out.println("\nGyőztél, gratulálok!\n");
        } else {
            System.out.println("\nNem sikerült. Próbáld meg újra!\n");
            jatek();
        }
    }

    public void kiirat() {
        for (int i = 0; i < ladak.length; i++) {
            System.out.printf("%20s",ladak[i]);
        }
        System.out.println();
        
    }

    public void kerdes() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMelyik láda szövegét szeretnéd elolvasni?");
            int valasz = scn.nextInt();
            switch (valasz) {
                case 1:
                    System.out.printf("%17s\n%20s",ladak[0],ladakszoveg[0]);
                    break;
                case 2:
                    System.out.printf("%35s\n%40s",ladak[1],ladakszoveg[1]);
                    break;
                default:
                    System.out.printf("%56s\n%60s",ladak[2],ladakszoveg[2]);
                    break;
            }
            System.out.println("");
        }
        System.out.println("");

    }

    public boolean valasztas() {
        boolean gyozelem;
        System.out.println("\nMelyikben van szerinted a kincs?\n1.: Arany láda\n2.: Ezüst láda\n3.: Bronz láda");
        int valasz = scn.nextInt();
        gyozelem = valasz == 2;
        return gyozelem;
    }

}
