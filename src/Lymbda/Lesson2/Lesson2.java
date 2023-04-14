package Lymbda.Lesson2;
// Найти 2 по длине слово
public class Lesson2 {
    public static void main(String[] args) {
        String[] arr = {"catrhfut","dogs","catuh","catu","overone"};
        Func func;
        func = (String[] arr1) ->{
            String preMaxId = "";
            int max = 0;
            int preMax = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].length() > max) {
                    max = arr1[i].length();
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].length()<max&&arr1[i].length()>preMax)
                    preMax = arr1[i].length();
                preMaxId=arr1[i];
            }
            return preMaxId;
        };
        System.out.println(func.findMaxLength(arr));
    }
}
