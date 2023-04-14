package ‘айлы.Hw;

import java.io.*;
import java.util.Scanner;

public class ¬вод— онсоли»«аписьќпределенных—лов {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] str = s.split(" ");
        scanner.close();
        try {
            PrintStream prStr = new PrintStream("d:/Files/ѕапка1/a1.txt");
            for (String i : str)
                if (i.length() < 5) {
                    prStr.print(i);
                    prStr.print(" ");
                }
        } catch (IOException e){
        }
        try {
            FileInputStream fI = new FileInputStream("d:/Files/ѕапка1/a1.txt");
            int i = -1;
            while ((i = fI.read())!=-1)
                System.out.print((char)i );

        } catch (IOException e){

        }
    }
}
