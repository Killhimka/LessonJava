package Lymbda.Hw;

public class Hw {
    public static void main(String[] args) {
        int[]arr = {1,9,4,6,5,3,};
        int max = 0;
        int preMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<max&&arr[i]>=preMax)
                preMax = arr[i];
        }
        System.out.println(max);
        System.out.println(preMax);
    }
}
