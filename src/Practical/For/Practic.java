package Practical.For;
// Вычислить прирост населения за 10 лет с учетом рождаемости и смертности ежегодно.
public class Practic {
    public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        for (int i = 0; i<10; i++) {
           if (born>7) born -=1;
           if(death>6) death -=1;
           population += population*(born-death)/1000;
        }

        System.out.println(population);
    }
}
