package Многопоточность.Hw.HwКораблиИПорты;

import java.util.*;

import static java.lang.Thread.sleep;

public class Port {
    Verf verf;
    HwКораблиИПорты.Potoc potoc1;
    int countBanana=0;
    int weightBanana;
    String nameBanana = "Banana";
    List<String> bananaList = Collections.synchronizedList(new LinkedList<>());
    List<String> breadList = Collections.synchronizedList(new LinkedList<>());
    List<String> clochesList = Collections.synchronizedList(new LinkedList<>());
    List<String> tunnelList = Collections.synchronizedList(new ArrayList<>());
    public void Banana() throws InterruptedException {

        System.out.println(countBanana+" Кораблей с бананами");
        System.out.println(bananaList);

    }
    int countCloches=0;

    public void Cloches () {
        System.out.println(countCloches+" Кораблей с одеждой.");
        System.out.println(clochesList);
    }
    int countBread=0;

    public void Bread(){
        System.out.println(countBread+" Кораблей с хлебом.");
        System.out.println(breadList);
    }
    public void tunnelList(){
        System.out.println(tunnelList);
    }

}
