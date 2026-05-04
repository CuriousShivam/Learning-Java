import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Vehical{
    String brand,engine, model;
    int noOfTyres;
}
class Car01 extends Vehical {
    boolean luxary;
    boolean sunroof;
    String usageType;
}
public class Generics {


    public static void main(){

//        List <Integer> il = new ArrayList<>();
//        il.add(43);
//        Iterator i = il.iterator();
//        System.out.println(i.next());

//        ArrayList<?> l = new ArrayList<>();
//        ArrayList<Car01> c = new ArrayList<>();
//        l=c;
//        c=l;

//        ArrayList<? extends Vehical> l = new ArrayList<>();//UpperBound
//        ArrayList<Vehical> v = new ArrayList<>();
//        ArrayList<Car01> c = new ArrayList<>();
//        v.add(new Vehical());
//        c.add(new Car01());
//        l=c;
//        l=v;
//        l.add(new Vehical());//error
//        l.add(new Car01());//error
//        c=l;//error
//        ArrayList<?> q = new ArrayList<>();
//        q=l;
//
//
//        ArrayList<? super Vehical> x = new ArrayList<>(); //LowerBound
//        x=v;
    }
}
