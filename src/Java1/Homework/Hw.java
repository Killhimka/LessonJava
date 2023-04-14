package Java1.Homework;

public class Hw {
    public static void main(String[] args) {
        int a ='П';
        int b ='Я';

        System.out.println(b%a);

        int c = 1071;
        char d = (char) c;
        System.out.println(d);

        // п/я остаток 16, дальше п+16 переводим инт в чар и получили Я

        float r = 103; // задумано ехать 250км за 1 час 43 мин
        int j = 250; // разделим дистанцыю на минуты и умножи на 60
        System.out.println(j/r*60); // 145.63 наша скорость

    }
}
