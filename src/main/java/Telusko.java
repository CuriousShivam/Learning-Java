//import java.sql.SQLOutput;
//
//interface Animal{
//    default String sound(){
//        return "Sound";
//    }
//}
//
//class Cat implements Animal{
//    String nature(){
//        return "Naughty";
//    }
//}
//
//
////class Tiger extends Animal{
////    {
////        System.out.println("Tiger init Block");
////    }
////    Tiger(String d){
////        //super();
////        super(d);
////        System.out.println("Tiger constructor");
////    }
////}
//public class Telusko {
//    public static void main() {
//        System.out.println("Main");
//        Animal a = new Cat();
//        System.out.println(
//               ((Cat)a).nature()
//                );

////        System.out.println("******************");
////        Tiger b = new Tiger("shivam");
////        System.out.println("******************");
////        Animal c = new Tiger("shiv");
//        }
//}
//
//

//public class Telusko{
//    static public void main ()throws InterruptedException {
//        System.out.println("hello There");
//        Thread.sleep(5000);
//        System.out.println("After Sleep");
//    }
//}

//class TestingInnerTryCatchFinally{
//    void test() {
//        try{
//            System.out.println(1);
//            int a = 3/0;
//            try{
//                System.out.println(2);
//            }catch(Error e) {
//                System.out.println(3);
//            }finally{
//                System.out.println(4);
//            }
//        }
//        catch(Error e) {
//            System.out.println(5);
//        }finally{
//            System.out.println(6);
//        }
//    }
//}
//
//
//public class Telusko{
//    void main(){
//        System.out.println("Hello");
//        TestingInnerTryCatchFinally t = new TestingInnerTryCatchFinally();
//        t.test();
//    }
//}



/////////Exception Handeling
//class Excep extends Exception{
//    public Excep(String msg){
//        super(msg);
//    }
//}
//
//class Telusko{
//    void main() throws Excep{
////        try {
////            Excep e = new Excep("Hello There");
////            throw e;
////        }
////        catch(Excep e){
////            System.out.println(e.getMessage());
////        }
//        Excep e = new Excep("Hello There");
//
//        System.out.println(e.getMessage());
//        throw e;
////    throw e;
//    }
//}

abstract class FuncInterface{
    abstract public void getPrint(String msg);

    @Override
    public String toString(){
        return "Hello";
    }


}

class Test extends FuncInterface{
    @Override
    public void getPrint(String msg){
        System.out.println("Hello in getPrint()");
    }

    public String getPrint(){
        System.out.println("String applied");
        return "";
    }
}

class Telusko{
    public static void main(String[] args){
        FuncInterface f = new Test();
        Test t = (Test) f;
        t.getPrint();
        System.out.println(f.toString());
//        int []a =new int[4];
//
//        int i = 0;
//        for(int ar:a) {
//            a[i]=101;
//            i++;
//        }
//        for (int ar:a)
//            System.out.println(ar);
    }
}