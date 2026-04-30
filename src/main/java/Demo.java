class Demo2{
public Demo2(){
    System.out.println("DEMO2");
}
static int a;
    static {
        a = 10;
        System.out.println("A :" + a);
        System.out.println("Static Block");
    }
}
public class Demo {


    public static void main(){
        System.out.println("Main Block");
        Demo2 a = new Demo2();
        System.out.println(a.a);
    }
}
