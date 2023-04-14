package JC2.Array.HwArray;

import java.util.Arrays;

public class Practical8 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*((max-min)+1)+min);
        }
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < 10; i++) {
            copyArr[i]= arr[i];
            if (copyArr[i]!=arr[i+1]&&i!=i+1);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));
    }
}
