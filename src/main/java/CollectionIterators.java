import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionIterators {
    static void main() {
//        Fail Fast
//    ArrayList a = new ArrayList();
//    a.add(23);
//    a.add(45);
//    a.add(35);
//    Iterator i = a.iterator();
//    while(i.hasNext()){
//        System.out.println(i.next());
//        a.add(43);
//    }
//



//        Fail Safe
//        CopyOnWriteArrayList a = new CopyOnWriteArrayList();
//        a.add(23);
//        a.add(45);
//        a.add(35);
//        Iterator i = a.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//            a.add(43);
//        }

//        Vector
        Vector v = new Vector();
        v.add(34);
        v.add(23);
        System.out.println(v);
        Enumeration e = v.elements();
//        Not smart as Iterator of Collection
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
            v.add(43);
        }

    }
}
