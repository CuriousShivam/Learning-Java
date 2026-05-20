import java.sql.SQLOutput;

class MSWord implements Runnable {
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("typing")){
            try{
                type();
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (name.equals("spellCheck")) {
            try{
                spellCheck();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            try{
                auto_save();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    void type() throws InterruptedException {
       for(int i = 0; i<10; i++){
           System.out.println("Typing");
            Thread.sleep(4000);
       }
    }

    void spellCheck() throws InterruptedException {
        for (int i = 0; i<10; i++){
            System.out.println("Spell Checking");
            Thread.sleep(4000);
        }
    }

    void auto_save() throws InterruptedException {
        for(;;){
            System.out.println("Auto-Saving");
            Thread.sleep(4000);
        }
    }
}

public class DaemonThread {

    void main(){
        MSWord typing = new MSWord();
        MSWord spellChecking = new MSWord();
        MSWord autoSave = new MSWord();

        Thread t = new Thread(typing);
        Thread sc = new Thread(spellChecking);
        Thread a = new Thread(autoSave);

        t.setName("typing");
        sc.setName("spellCheck");
        a.setName("autoSave");

        sc.setDaemon(true);
        a.setDaemon(true);

        sc.setPriority(3);
        a.setPriority(4);

        t.start();
        sc.start();
        a.start();
    }
}
