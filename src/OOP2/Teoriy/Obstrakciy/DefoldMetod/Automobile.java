package OOP2.Teoriy.Obstrakciy.DefoldMetod;

public interface Automobile {
    default void stop(){
        System.out.println("Break");
    }
}
