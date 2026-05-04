import java.sql.SQLOutput;
import java.util.*;

public class Collections01 {
    static void main(){
//    List,Queue, Set -> Collection -> Iterable
//    ArrayList, LinkedList, ArrayDeque, PriorityQueue, TreeSet, HashSet, LinkedSet
//    ArrayList -> Child of List It is Dynamic Array Data Structure
//    ArrayList a = new ArrayList();
//    a.add(1);
//    a.add("Shivam");
//    a.remove(1);
//    a.add(55);
//    System.out.println(a);
//    a.add(1, 30);
//    System.out.println(a);



//      LinkedList -> List -> Deque -> Doubly Linked List
//        LinkedList l = new LinkedList();
//        l.add(new int[]{43,43});
//        l.add(43);
//        ArrayList a = new ArrayList();
//        a.add(23);
//        a.add(32);
//        l.addAll(a);
//        System.out.println(l);
//        System.out.println(l.peek());

//        ArrayDeque  -> Deque -> DoubleEndedQueue
//        ArrayDeque d = new ArrayDeque();
//        d.add(44);
//        d.addFirst(55);
//        System.out.println(d);


//        ProirityQueue -> Queue -> min heap data structure
//        PriorityQueue p = new PriorityQueue();
//        p.add(3);
//        p.add(7);
//        p.add(1);
//        p.add(10);
//        p.add(35);
//        System.out.println(p);
//        p.offer(34);
//        p.remove(3);
//        System.out.println(p);

//        TreeSet implements -> Navigable Set extends -> Sorted Set implements-> Set Interface -> Collection -> Iterable
//        InOrder Traversal, Ascending Order Sorting
//        TreeSet t = new TreeSet();
//        t.add(50);
//        t.add(75);
//        t.add(25);
//        System.out.println(t);
//        System.out.println(t.ceiling(44));
//        System.out.println(t.higher(50));
//        System.out.println(t.tailSet(3));
//        System.out.println(t.headSet(34));

//        Hash Set- Hash Function and Hash Table implements Set Class
//        HashSet h = new HashSet();
//        h.add(234);
//        h.add(234);
//        h.add(43);
//        h.add(958);
//        h.add(545);
//
//        System.out.println(h);
//        for(Object a:h){
//            System.out.println(a);
//        };
//        Linked Hash Set
            LinkedHashSet l = new LinkedHashSet();
        l.add(234);
        l.add(234);
        l.add(43);
        l.add(958);
        l.add(545);
        System.out.println(l);
        for(Object a:l){
            System.out.println(a);
        };
    }
}
