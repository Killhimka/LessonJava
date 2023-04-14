package OOP.Lesson.Lesson2;
//
public class Lesson2 {
    public static void main(String[] args) {
        Persone persone1 = new Persone("Vitalik", 20);
        Persone persone2 = new Persone("Yura", 40);

        persone1.talk();
        persone1.move();

        persone2.talk();
        persone2.move();

    }
}
