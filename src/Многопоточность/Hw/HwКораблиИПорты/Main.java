package Flot;

import com.mysql.cj.util.StringUtils;

import java.util.*;

public class Main {
static Port port = new Port();
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        PortBanana portBanana = new PortBanana();
        PortCloches portCloches = new PortCloches();
        PortBread portBread = new PortBread();
        portBanana.portBanana(list);
        portCloches.portCloches(list1);
        /* portCloches.start();*/
        /* portBread.start();*/

    }

    static class PortBanana extends Thread {

        public List portBanana(List<String> list1) {
            List<String> list = new ArrayList<>();
            /*Port port = new Port();*/
            port.portBanana(list);
            System.out.println(list + " POTOC Banana");
            for (String s : list) {
                if (StringUtils.endsWithIgnoreCase(s, "10")) {
                    try {
                        sleep(1000);
                        System.out.println("10 Бананы Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (s.contains("50")) {
                    try {
                        sleep(3000);
                        System.out.println("50 Бананы Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (s.contains("100")) {
                    try {
                        sleep(5000);
                        System.out.println("100 Бананы Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            start();
            System.out.println(list + " potoc Banana");
            return list1;
        }
    }
    static class PortCloches extends Thread{

         public List portCloches(List<String> list1) {
            /*Port port = new Port();*/
            List<String> list = new LinkedList<>();
            port.portCloches(list);
             System.out.println(list + " POTOC Cloches");
            for (String s: list) {
                if (StringUtils.endsWithIgnoreCase(s,"10")) {
                    list.add(s);
                    try {
                        sleep(1000);
                        System.out.println("10 Ткань Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (s.contains("50")){
                    try {
                        sleep(3000);
                        System.out.println("50 Ткань Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else if (s.contains("100")){
                    try {
                        sleep(5000);
                        System.out.println("100 Ткань Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            start();
             System.out.println(list + " potoc cloches");
            return list1;
        }
    }
    static class PortBread extends Thread{

        @Override
        public void run() {
            List<String> list = new LinkedList<>();
            Port port = new Port();
            port.portBread(list);
            for (String s: list) {
                if (StringUtils.endsWithIgnoreCase(s,"10")) {

                    try {
                        sleep(1000);
                        System.out.println("10 Хлеб Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (s.contains("50")){

                    try {
                        sleep(3000);
                        System.out.println("50 Хлеб Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else if (s.contains("100")){
                    try {
                        sleep(5000);
                        System.out.println("100 Хлеб Загружен");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
}
class Port{
 private Tunnel portList = new Tunnel();
 private List <String> listPort = Collections.synchronizedList(new LinkedList<>());
    public List portBanana(List<String>list){
        portList.listTunnel(listPort);
        for (String s: listPort) {
            if (s.contains("Banana")) {
                list.add(s);
            }
        }
        return list;
    }
    public List portCloches(List<String>list){
        List<String> clochesList = new LinkedList<>();
        portList.listTunnel(listPort);
        for (String s: listPort) {
            if (s.contains("Cloches")) {
                clochesList.add(s);
            }
        }
        return list;
    }
    public List portBread(List<String>list){
        List<String> breadList = new LinkedList<>();
        portList.listTunnel(listPort);
        for (String s: listPort) {
            if (s.contains("Bread")) {
                breadList.add(s);
            }
        }
        return list;
    }

}
class Tunnel{
    public List listTunnel (List <String> listTunnel){
        List <String> portList = Collections.synchronizedList(new LinkedList<>());
        Control control = new Control();
        control.Contr(portList);
        for (int i = 0; i < 5; i++) {
            listTunnel.add(portList.remove(0));
            System.out.println(listTunnel+" "+"3");
        }

        return listTunnel;
    }
}
class Control{
    public List Contr(List<String> listShip){
        Verf verf = new Verf();
        String [] nameArr1 = {"Banana", "Bread", "Cloches"};
        String [] vesArr = {"10","50","100"};
        for (int i = 0; i < 10; i++) {
            listShip.add(verf.random(nameArr1,vesArr));
        }
        System.out.println(listShip+" "+"2");
        return listShip;
    }
}
class Verf{
    public String random(String[] nameArr, String[] vesArr){
        String s = nameArr[new Random().nextInt(nameArr.length)].concat(" ")
                .concat(vesArr[new Random().nextInt(vesArr.length)]);
        System.out.println(s+" "+"1");
        return s;
    }
}



