package �����;

import java.io.*;
import java.util.Scanner;

// ������ �� �����
public class ������������� {
    public static void main(String[] args) throws IOException {
        /*FileReader fileReader = new FileReader("readme.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        while ((str = bufferedReader.readLine())!=null){
            System.out.println(str);            // ����� ��� ������ ������
        }*/
        /*Scanner scanner = new Scanner(new File("d:/Files/�����1/a.txt"));
        String str1 = scanner.nextLine();
        System.out.println(str1);           // ����� ������ ������*/
        /*fileReader.close();
        System.out.println(str);*/

        FileInputStream fI = new FileInputStream("d:/Files/�����1/a1.txt");
        int i = 0;
        while ((i = fI.read())!=-1)
        System.out.print((char)i );             // ������� ���� ����� �� �����

        /*FileInputStream fI = new FileInputStream("d:/Files/�����1/a1.txt");
        StringBuffer s = new StringBuffer();        // ������ � ��������� ����������
        int i = 0;
        while ((i = fI.read())!=-1)
            s.append((char) i);
        System.out.println(s);                  // ����� ���� ���� �� �����*/
    }
}
