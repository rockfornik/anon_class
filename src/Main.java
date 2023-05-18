
public class Main {
    public static void main(String[] args) {
        //работа вложенными классами
        Computer comp1 = new Computer();
        comp1.i7.start();
        comp1.trans.start();

        //пример анонимного класса
        new Computer(){
            void megaComp(){
                this.i7.start();
                this.trans.start();
            }
        };
    }
}