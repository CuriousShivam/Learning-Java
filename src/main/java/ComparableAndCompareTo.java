import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Employee {
//    String name, designation;
//    LocalDate joiningDate;
//    int salary;
//
//    public Employee(String name, String designation, LocalDate joiningDate, int salary) {
//        this.name = name;
//        this.designation = designation;
//        this.joiningDate = joiningDate;
//        this.salary = salary;
//    }
//}

class Employee implements Comparable<Employee>{
    String name, designation;
    LocalDate joiningDate;
    int salary;

    @Override
    public int compareTo(Employee o) {
        if(this.salary>o.salary){
            return -1;
        }else{
            return 1;
        }
    }

    public Employee(String name, String designation, LocalDate joiningDate, int salary) {
        this.name = name;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

//class C implements Comparator<Employee>{
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        if(o1.salary>o2.salary) return -1;
//        else return 1;
//    }
//
//
//}

public class ComparableAndCompareTo {
    static void main(){
        Employee e = new Employee("Shivam", "Dev", LocalDate.of(2006,3,5), 30000);
        Employee e1 = new Employee("Shubham", "Advisor", LocalDate.of(2011,11,20), 45000);
        Employee e2 = new Employee("Satyam", "Salesman", LocalDate.of(2012,2,5), 33000);
        ArrayList<Employee> el = new ArrayList<>();
        el.add(e);
        el.add(e1);
        el.add(e2);
        System.out.println(el);

        //Using Comparator
        //Implementing class
//        C c = new C();
//        Collections.sort(el,c);
//        System.out.println(el);

        //Implementing through anoynomous function

//        Comparator<Employee> c = new Comparator<>(){
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.salary > o2.salary) return -1;
//                else return 1;
//            }
//        };
//
//        Collections.sort(el,c);
//        System.out.println(el);


        //Implementing thorugh Lambda Expression
//        Comparator<Employee> c = (Employee o1, Employee o2)->{
//            if(o1.salary > o2.salary){
//                return -1;
//            }else{
//                return 1;
//            }
//        };
//
//        Collections.sort(el,c);
//        System.out.println(el);

        //Implementing Comparable Interface
        Collections.sort(el);
        System.out.println(el);
    }
}
