package OOP2.Teoriy.GetterSetter;
// Sett - (c английского) установить (устанавливает какое-то значение)
// Get - (с английского) получить (получаем какие то значения)
public class Car {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed<=300) {
            this.maxSpeed = maxSpeed;
        }
        else System.out.println("Недопустимое значение скорости");
    }
}
