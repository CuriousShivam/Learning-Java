import java.sql.SQLOutput;
import java.util.*;
import java.util.Map.Entry;

class Passport{
    String name;
    int age;

    public Passport(String name, int age, String belongsTo) {
        this.name = name;
        this.age = age;
        this.belongsTo = belongsTo;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", belongsTo='" + belongsTo + '\'' +
                '}';
    }

    String belongsTo;
}
public class Map {
    static void main(){
        Passport p1 = new Passport("Shivam", 22, "India");
        Passport p2 = new Passport("Shubham", 23, "China");
        Passport p3 = new Passport("Satyam", 20, "Nepal");

        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(2);
        Integer i3 = Integer.valueOf(3);

        HashMap<Integer, Passport> h = new HashMap<>();
        h.put(i1,p1);
        h.put(i2,p2);
        h.put(i3,p3);

//        System.out.println(h);
//        System.out.println(h.get(2));
//        Set <Integer> x = h.keySet();
//        System.out.println(x);

//        Collection <Passport> c = h.values();
//        System.out.println(c);

        Set<Entry<Integer, Passport>> s = h.entrySet();
        System.out.println(s);

        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Scanner sc = new Scanner(System.in);

//        Integer userInput = sc.nextInt();
//        Iterator i = x.iterator();
//
//        while(i.hasNext()){
//            if(userInput.equals(i.next())){
//                System.out.println(h.get(userInput));
//            }
//        }
















































        //System.out.println(h);


    }
}
