//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package OOP.Hw.Hw3Diskriminant;

public class Discriminant {
    int a;
    int b;
    int c;
    int disc;

    public Discriminant(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Disc() {
        System.out.println("Решаем квадтратное уровнение вида:");
        System.out.println("ax^2 - bx + c = 0");
        this.disc = this.b * this.b - 4 * this.a * this.c;
        if (this.disc < 0) {
            System.out.println("Нет корней.");
            System.exit(1);
        } else if (this.disc == 0) {
            int x = -this.b / (2 * this.a);
            System.out.println("В уравнении 1 корень: x = " + x);
        } else {
            double x1 = ((double)(-this.b) - Math.sqrt((double)this.disc)) / (double)(2 * this.a);
            double x2 = ((double)(-this.b) + Math.sqrt((double)this.disc)) / (double)(2 * this.a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }

    }
}
