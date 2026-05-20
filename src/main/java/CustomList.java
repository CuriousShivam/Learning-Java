//.Implement a generic class called "CustomList" that functions like a simple list.
//It should support adding elements, retrieving elements by index, and displaying
//the list contents. Include methods to add, get, and display elements.

import java.util.Arrays;

class MyCustomList<T>{
    Object [] elements;
    int size = 0;
    int defaultSize = 10;

    MyCustomList(){
        elements = new Object[defaultSize];
    }

    void add(T data){
        elements[size] = data;
        size++;
    }

    void display(){
        System.out.println(Arrays.toString(elements));
    }

    Object get(int i){
        return elements[i];
    }
}

class CustomList{
    @Override
    public String toString() {
        return super.toString();
    }

    void main(){
        MyCustomList <String>l = new MyCustomList<>();
        l.add("Shivam");
        l.add("Alok");
        l.display();
        System.out.println("***********************");
        System.out.println(l.get(0));
        System.out.println(l.get(1));


    }


}