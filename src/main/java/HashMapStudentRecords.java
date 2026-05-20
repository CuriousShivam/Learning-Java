//.Develop a program using HashMap to store student details. Utilize the student
//ID as the key and include attributes like name, age, and grade. Implement
//methods to add, display, update, and remove student records.

import java.util.HashMap;

class Student{

    int id, age;

    String name, grade;

    Student(int id, int age, String name, String grade){
        this.id = id;
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + ", age: " + this.age + ", grade: " +this.grade+ ", name: "+this.name;
    }

}

class StudentRecord {
    HashMap <Integer,Student> studentsRecord;

    StudentRecord(HashMap<Integer, Student> students){
        this.studentsRecord = students;
    }

    void add(Student s){
        studentsRecord.put(s.id, s);
    }

    void display(){
        studentsRecord.forEach((key, value)-> System.out.println(key.toString() + " [ " + value + " ]"));
    }

    void update(Student s){
        Student stu = studentsRecord.get(s.id);
        stu.setAge(s.age);
        stu.setGrade(s.grade);
        stu.setName(s.name);
    }

    //   display, update, and remove
}
public class HashMapStudentRecords {

    void main(){
        HashMap<Integer,Student> collection = new HashMap<>();
        StudentRecord sr = new StudentRecord(collection);
        Student s1 = new Student(1,20,"Shivam","13th");
        Student s2 = new Student(2,20,"Kirish","13th");
        sr.add(s1);
        sr.add(s2);
        sr.display();
        s2.setName("Satyam");
        sr.update(s2);
        sr.display();

    }

}
