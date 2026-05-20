class Queue{
    int data;
    boolean flag=false;
    synchronized public void produce(){
        while(true){
            if(flag==true){
                data++;
                System.out.println("Produced Data " + data);
                flag=false;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println('H');
                    throw new RuntimeException(e);
                }
            }

        }
    }

    synchronized public void consume(){
        while(true){
            if(flag == false){
                System.out.println("Consumed Data " + data);
                flag=true;
                notify();

            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }
}

public class ProducerConsumerProblem {
    void main(){
        Queue q = new Queue();
        Thread t1 = new Thread(()->q.consume());
        Thread t2 = new Thread(()->q.produce());
        t1.start();
        t2.start();
    }
}
