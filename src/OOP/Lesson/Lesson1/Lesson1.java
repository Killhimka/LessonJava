package OOP.Lesson.Lesson1;
// Вывод вес модель и номер телефона
public class Lesson1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(200,"Samsung",37529);
        Phone phone2 = new Phone(250,"Iphone",37533);
        Phone phone3 = new Phone(300,"Xiaomi",37544);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
    }
}
