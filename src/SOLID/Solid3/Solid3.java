package SOLID.Solid3;

public class Solid3 {
    public static void main(String[] args) {
        Computer comp = new Computer("IBM XT",5000);
        SaveInterface saver = new SaveComputerToFile();
        saver.save("out.data",comp);
        test();
    }
    public static void test(){
        Computer comp = new Computer("IBM XT",5000);
        Computer comp2 = new OmenHP("Omen HP",5000);

        comp2.setData("IBM XT");
        if(comp.name.compareTo(comp2.name)==0 && comp.memory_size == comp2.memory_size){
            System.out.println("Ok");
        }else System.out.println("No");
    }
    }
    class Computer{                     // ÁÀÇÎÂÛÉ ÊËÀÑÑ
        String name;
        int memory_size;

        public Computer(String name, int memory_size) {
            this.name = name;
            this.memory_size = memory_size;
        }
        public void setData(String name){
            this.name = name;
        }                                   //      ********** ÎÑÍÎÂÍÎÉ ÏÀĞÀÌÅÒĞ

        @Override
        public String toString() {
            return "Computer{" +
                    "name='" + name + '\'' +
                    ", memory_size=" + memory_size +
                    '}';
        }
    }
    class SaveComputerToFile implements SaveInterface {
        public void save(String path, Computer cmp){
            System.out.println("Cîõğàíåíèå â ôàéë "+path+", "+cmp);
        }
    }
    class SaveComputerToDB implements SaveInterface {
        public void save(String path, Computer cmp){
            System.out.println("Cîõğàíåíèå â DB "+path+", "+cmp);
        }
    }
    interface SaveInterface{                // ñîçäàíèå èíòåğôåéñà
        void save(String path, Computer cmp);
    }
    class OmenHP extends Computer{                      // ÄÎ×ÅĞÍÈÉ ÊËÀÑÑ
        public OmenHP(String name, int memory_size) {
            super(name, memory_size);
        }
        public void setData(String name){
            this.name = name;
            this.memory_size = 8000;        //    ******  ÈÇÌÅÍÅÍÍÛÉ ÏÀĞÀÌÅÒĞ ÁÀÇÎÂÎÃÎ ÊËÀÑÑÀ
        }
}

