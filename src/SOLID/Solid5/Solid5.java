package SOLID.Solid5;

public class Solid5 {
    public static void main(String[] args) {
        ModelForm f = new ModelForm(1,30,"����");
        WebFramework w = new WebFramework();
        w.save(f);
    }
    static class ModelForm implements IForm{ // ������� ����������� �� ����������
        int id;
        int old;
        String fio;

        public ModelForm(int id, int old, String fio) {
            this.id = id;
            this.old = old;
            this.fio = fio;
        }
    }
    static  class MySQL implements ISQL{
        public void save(IForm frm){                          // �������� � ������ ����� ���������
            System.out.println("������ ����� � ���� ������");
        }
    }
    static class WebFramework{
        public void save(IForm frm){        // �������� � ������ ����� ���������
            ISQL db = new MySQL();
            db.save(frm);
        }
    }

    interface IForm{

    }
    interface ISQL{
            public void save(IForm f);
    }
}
