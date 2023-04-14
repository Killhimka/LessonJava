package JC2.Matrix.Lesson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEndTime {
    public static void main(String[] args) {

        Date date = new Date();            //Нынешнее: день,месяц,число,время,часовой пояс,год
        System.out.println(date.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("G,Y,M,d,h,H,m,s,E,D");
        System.out.println(simpleDateFormat.format(date));

//        Thread.sleep(5000);         // 5 секунд приостановка программы
    }
}
// G - Обозначение эры
// Y - Год из четырех цыфр
// M - Номер месяца года
// d - Число месяца
// h - Формат часа 1-12
// H - Формат часа 0-23
// m - Минуты
// s - Секунды
// E - День недели
// D - Номер дня в году