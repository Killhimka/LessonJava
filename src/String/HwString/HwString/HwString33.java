package String.HwString.HwString;

import java.util.Locale;

public class HwString33 {
    public static void main(String[] args) {
        String[] str = "����������� ��� ������� ������".split(" ");
        String s = "���";
        for (String i : str)
            if (s.equals(i.toLowerCase(Locale.ROOT)))
                System.out.println("Yes");
        else System.out.println("No");
    }
}
