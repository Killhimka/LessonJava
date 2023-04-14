package OOP.Lesson.Lesson4;

public class Car {
    private int maxSpeed;
    private String model;
    private int volume;

    public Car(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed>400){
        }else
            this.maxSpeed = maxSpeed;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }
}
