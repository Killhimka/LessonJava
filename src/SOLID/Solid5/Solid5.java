package SOLID.Solid5;

public class Solid5 {
    public static void main(String[] args) {
        ModelForm f = new ModelForm(1,30,"Бала");
        WebFramework w = new WebFramework();
        w.save(f);
    }
    static class ModelForm implements IForm{ // Сделали зависимость от интерфейса
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
        public void save(IForm frm){                          // работаем с формой через интерфейс
            System.out.println("Запись формы в базу данных");
        }
    }
    static class WebFramework{
        public void save(IForm frm){        // работаем с формой через интерфейс
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
