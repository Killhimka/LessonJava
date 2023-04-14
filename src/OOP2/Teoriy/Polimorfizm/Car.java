package OOP2.Teoriy.Polimorfizm;

public class Car {
    public void move(String distance){          // move - двигать
        System.out.println(distance);
    }
    public void move(int speed){
        if (speed==200)
            System.out.println("Yes");
        else System.out.println("no");
    }
}
