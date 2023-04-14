package JC2.Matrix.Lesson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEndTime {
    public static void main(String[] args) {

        Date date = new Date();            //��������: ����,�����,�����,�����,������� ����,���
        System.out.println(date.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("G,Y,M,d,h,H,m,s,E,D");
        System.out.println(simpleDateFormat.format(date));

//        Thread.sleep(5000);         // 5 ������ ������������ ���������
    }
}
// G - ����������� ���
// Y - ��� �� ������� ����
// M - ����� ������ ����
// d - ����� ������
// h - ������ ���� 1-12
// H - ������ ���� 0-23
// m - ������
// s - �������
// E - ���� ������
// D - ����� ��� � ����