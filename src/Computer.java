public class Computer {
   //Вложенный класс процессор(в комп. есть проц.)
    class Processor {
       private boolean isStart = false;
        public void start () {
            isStart = true;
            System.out.println("Включился процессор. isStart = " + isStart);
        }
        public void shutdown () {
            isStart = false;
        }
    }
    //Вложенный класс РАМ(в комп. есть память)
    class Ram {
        private boolean isStart = false;

        public void start() {
            isStart = true;
            System.out.println("Включилась память. isStart = " + isStart);
        }

        public void shutdown() {
            isStart = false;
        }
    }
    //Объекты
    Processor i7 = new Processor();
    Ram trans = new Ram();
}
