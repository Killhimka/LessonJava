package Colection.Hw.Hw2;
// �������� �����, �������� ������ � 1 ����������
import java.util.*;

public class Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set set = new HashSet(Arrays.asList(scanner.nextLine().split(" ")));
        System.out.println(set);

    }
}
