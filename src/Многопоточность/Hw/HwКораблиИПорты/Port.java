package ���������������.Hw.Hw�������������;

import java.util.*;

import static java.lang.Thread.sleep;

public class Port {
    Verf verf;
    Hw�������������.Potoc potoc1;
    int countBanana=0;
    int weightBanana;
    String nameBanana = "Banana";
    List<String> bananaList = Collections.synchronizedList(new LinkedList<>());
    List<String> breadList = Collections.synchronizedList(new LinkedList<>());
    List<String> clochesList = Collections.synchronizedList(new LinkedList<>());
    List<String> tunnelList = Collections.synchronizedList(new ArrayList<>());
    public void Banana() throws InterruptedException {

        System.out.println(countBanana+" �������� � ��������");
        System.out.println(bananaList);

    }
    int countCloches=0;

    public void Cloches () {
        System.out.println(countCloches+" �������� � �������.");
        System.out.println(clochesList);
    }
    int countBread=0;

    public void Bread(){
        System.out.println(countBread+" �������� � ������.");
        System.out.println(breadList);
    }
    public void tunnelList(){
        System.out.println(tunnelList);
    }

}
