package Colection.Hw.Hw;

public class HeavyBox {
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "box=" + weight +
                '}';
    }
}
