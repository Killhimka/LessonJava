package Practical.For;

import java.util.Arrays;

public class Practical5 {
    public static void main(String[] args) {
        int n = 2;
        int[] arr = new int[]{1,2,2,3,5,4,6,2,3,5};
        int[] arr1 = new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=n) {
                count++;
                arr1[i]+=arr[i];
            }
        }

        System.out.println(count);
        System.out.println(Arrays.toString(arr1));
    }
    
}
