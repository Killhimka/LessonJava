package JC.Lesson;
// Координатная плоскость
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();

        if (x>0&&y>0){
            System.out.println("Точка [ " + x + ", " + y + " ] - пренадлежит 1 четверти.");
        }   else if (x<0&&y>0){
            System.out.println("Точка [ " + x + ", " + y + " ] - пренадлежит 2 четверти.");
        }   else if (x<0&&y<0){
            System.out.println("Точка [ " + x + ", " + y + " ] - пренадлежит 3 четверти.");
        }   else {
            System.out.println("Точка [ " + x + ", " + y + " ] - пренадлежит 4 четверти.");
        }
    }
}
