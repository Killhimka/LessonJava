package OOP.Hw.Practic;

import java.util.Scanner;

public class Cat {
    private int age;
    private String name;
    private int numb;
    private int[] bal = new int[5];
    private Scanner scanner = new Scanner(System.in);
    private float n;

    void maceSound(){
        System.out.println("Myu");
        for (int i = 0; i < 5; i++) {
            bal[i] = scanner.nextInt();
            n += bal[i];
        }
        System.out.println(n/5);
    }

    public Cat(int age, String name, int numb) {
        this.age = age;
        this.name = name;
        this.numb = numb;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", numb=" + numb +
                '}';
    }
}
