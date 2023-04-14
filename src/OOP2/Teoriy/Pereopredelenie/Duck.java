package OOP2.Teoriy.Pereopredelenie;

public class Duck extends Animals {  // наследие                    // Duck - Утка
    @Override//- Переводится как Переписаный - сигнатура метода должна быть такая же (модификатор доступа - void,
    // название - makeSound и передаваемое значение System.out.println("Кряк!");) - переписывали Animals.
    // Важное значение: тип возвращаемого значения должен быть таким же.
    void makeSound(){
        System.out.println("Кряк!");
    }
}
