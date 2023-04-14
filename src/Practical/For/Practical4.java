package Practical.For;
// Найти минимальное, среднее и максимальное значение в случайном массиве.
import java.util.Arrays;

public class Practical4 {
    public static void main(String[] args) {
        int max = 20;
        int min = 1;
        int[] numb = new int[max];
        for (int i = 0; i < numb.length; i++) {
            numb[i] =(int) (Math.random()*((max-min)+1)+min);
        }

        for (int i = 0; i < numb.length; i++) {
            for (int j = 0; j < numb.length; j++) {
                if (numb[i]<numb[j]) {
                    int temp = numb[i];
                    numb[i] = numb[j];
                    numb[j] = temp;
                }
            }
        }
        int nMax = 0;
        int nMin = numb.length;
        int n = numb[10];
        for (int i = 0; i < numb.length; i++) {
            if (nMin >= numb[i])
                nMin = numb[i];
            if (nMax <= numb[i])
                nMax = numb[i];
        }
        for (int i = 0; i < numb.length; i++) {
            if (nMax/numb[i]==2)
                n=numb[i];
        }
        System.out.println(n);
        System.out.println(Arrays.toString(numb));
        System.out.println(nMax);
        System.out.println(nMin);



    }
}
