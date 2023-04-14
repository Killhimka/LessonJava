package OOP2.Teoriy.Incapsulyciy;
// »нкапсул€ци€ - это сокрытие реализации каких-то функцый программы от пользовател€.
public class Car {
    private int cost;   // ќбласть видимости только класс в котором объ€влен
    int maxSpeed;       // ќбласть видимости пакет и класс
    protected String type;      // package-private + используетс€ в классах наследниках
    public int minSpeed;        // ¬идно во всей программе

    void gas(){
        System.out.println("Faster");
    }
}
