package String.HwString.HwString;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class HwString55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        boolean lain = true;
        char[] lain1 = str1.toCharArray();
        char[] lain2 = str2.toCharArray();
        for (int i = 0; i < lain1.length-lain2.length; i++) {
        lain=true;
            for (int j = 0; j < lain2.length; j++) {
                if (lain1[i+j]!=lain2[j]){
                    lain=false;
                    break;
                }
            }
            if (lain){
                break;
            }

        }
        if (!lain)
        System.out.println("no");
        else
        System.out.println("Yas");



        }












}
