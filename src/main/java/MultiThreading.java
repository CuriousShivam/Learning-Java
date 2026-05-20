class Thread1 extends Thread{
    @Override
    synchronized public void run(){
        func();
    }
    synchronized static void func(){
        String tname = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(4000);
                System.out.println("Running Thread  " + tname + " " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class MultiThreading {
void main(){
    Thread1 t1 = new Thread1();
    Thread1 t2 = new Thread1();
    t1.setName("Shivam");
    t2.setName("Nikhil");
    t1.start();
    t2.start();
}
}
