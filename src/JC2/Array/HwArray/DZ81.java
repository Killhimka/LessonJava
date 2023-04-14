package JC2.Array.HwArray;

import java.util.Arrays;
import java.util.Scanner;

public class DZ81 {
    public static void main(String[] args) {
        int min = -15;
        int max = 15;
        int j = 0;

        int[] mainM = new int[10];
        int[] mas1 = new int[mainM.length/2];
        int[] mas2 = new int[mainM.length/2];
        int[] pos = new int[10];
        int[] odd = new int[10];
        for (int i = 0; i < mainM.length; i++) {
            mainM[i] = (int) (Math.random()*((max-min)+1)+min);
            if (i<mainM.length/2) {mas1[i] = mainM[i];}
                else {mas2[j++] = mainM[i];}
            if (mainM[i]>0) {pos[i] = mainM[i];}
            if (mainM[i]%2!=0) {odd[i] = mainM[i];}
        }
                System.out.println("Основной массив: " + Arrays.toString(mainM));
                System.out.println("Первая половина: " + Arrays.toString(mas1));
                System.out.println("Вторая половина:                     " + Arrays.toString(mas2));
                System.out.println("Положительные числа:" + Arrays.toString(pos));
                System.out.println("Положительные числа:" + Arrays.toString(pos));

    }
}
