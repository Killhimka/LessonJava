package JC.For.ForHw;
// Сумма чисел равна произведению
public class ForHw3 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000 ; i++) {
            int first, second, third, number4;
            first = i % 10;
            second = (i / 10) % 10;
            number4 = ((i / 10) / 10) % 10;
            third = (((i/10)/10)/10)%10; // i/1000
            if (first + second + third + number4 == first * second * third * number4) {
                System.out.println(i);
            }
        }
    }
}
