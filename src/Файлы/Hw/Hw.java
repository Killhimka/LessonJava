package Файлы.Hw;
// Считает сколько букв F и перезаписывает результат в файл
import java.io.*;

public class Hw {
    public static void main(String[] args) throws IOException {
        int size = 0;
        String s = "f";
        int count = 0;
        char c = (char) count;
        File file = new File("d:/Files/Папка1/a.txt");
        try {
            FileReader fR = new FileReader(file);
            while ((size = fR.read()) != -1) {
                if ((char) size == s.charAt(0)) {
                    count++;
                }
                System.out.print((char) size);
            }

        } catch (IOException e) {
        }
        PrintStream prStr = new PrintStream("d:/Files/Папка1/a.txt");
        prStr.println(count);

        FileReader fR1 = new FileReader("d:/Files/Папка1/a.txt");
        while ((size= fR1.read())!=-1)
            System.out.print((char) size);
    }
}
