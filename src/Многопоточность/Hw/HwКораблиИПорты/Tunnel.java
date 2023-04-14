package Многопоточность.Hw.HwКораблиИПорты;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Tunnel {
    Semaphore semaphore ;
    Port portBanana;
    HwКораблиИПорты.Potoc potoc;
    List <String> name = Collections.synchronizedList(new LinkedList<>());
    int weight ;
    Verf verf;
    int count = 0;
     public void Bloc() throws InterruptedException {
         Verf1 verf1 = new Verf1();
         verf1.Ship();
         Port port = new Port();
         Exchanger<String> exchanger = new Exchanger<>();
         ExecutorService executorService = Executors.newFixedThreadPool(3);
         /*CountDownLatch countDownLatch =new CountDownLatch(1);*/

         Semaphore semaphore = new Semaphore(2);
         Tunnel tunnel = new Tunnel();

         for (int i = 0; i < 10; i++) {
             executorService.submit(new Verf(verf1.nameShip.remove((int) (Math.random() * verf1.nameShip.size())),
                     verf1.weightShip.remove((int) (Math.random() * verf1.weightShip.size())), exchanger));
             /*verf.start();*/
             count++;

             /* verf.semaphore = semaphore;*/
         }
         executorService.shutdown();
         /*Thread.sleep(3000);*/
         port.tunnelList();
         port.Banana();
         port.Cloches();
         port.Bread();
         /*System.out.println("Конец");
         System.out.println(count);
         System.out.println(verf1.nameShip);
         System.out.println(verf1.weightShip);*/

    }

}
