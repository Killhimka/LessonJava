package OOP2.HwOOP2.Hw4;

import java.util.Objects;

public class Car {
    private String stamp;                               // Марка
    private String model;                               // Модель
    private float engine;                                 // Объем
    private int year;                                   // Год

    public Car(String stamp, String model) {
        this.stamp = stamp;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(stamp, car.stamp) && Objects.equals(model, car.model);
    }

}
