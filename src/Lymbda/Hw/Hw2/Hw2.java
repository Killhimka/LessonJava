package Lymbda.Hw.Hw2;
// Найти 2 по величине значение
public class Hw2 {
    public static void main(String[] args) {
        int[]arr = {8,9,4,6,5,3,5,3,4,6};
        Func func = (arr1) ->{
            int max = 0;
            int preMax = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]>max)
                    max=arr1[i];
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]<max&&arr1[i]>=preMax)
                    preMax = arr1[i];
            }
            return preMax;
        };
        System.out.println(func.numb(arr));
    }
}
