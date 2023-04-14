package JC.For;
// Сумма чисел равна произведению
public class For6 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {
            int first, second, third;
            first = i%10;
            second = (i/10)%10;
            third = i/100;
            if (first+second+third == first*second*third){
                System.out.println(i);
            }
        }
    }
}
