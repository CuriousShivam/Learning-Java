//Design a restaurant menu using a HashMap to store dish names and their
//prices. Allow users to add new dishes, update prices, display the menu, and
//remove items from the menu.

import java.util.HashMap;

class Dish{
    String name;
    int price;

     public Dish(String name, int price) {
         this.name = name;
         this.price = price;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getPrices() {
         return price;
     }

     public void setPrices(int price) {
         this.price = price;
     }
 }

 class Menu {
    private HashMap <String,Integer> menu = new HashMap<>();;

//    Menu(){
//        this.menu = new HashMap<>();
//    }
    void add(Dish d){
        menu.put(d.name, d.price);
    }

    void updatePrice(Dish d){
//        menu.get(d.name) = d.price;
        menu.replace(d.name, d.price);
     }

    void display(){
        menu.forEach((key,value)-> System.out.println(key + value));
    }

    void remove(String name){
        menu.remove(name);
    }
 }
public class RestaurantMenu {
    void main(){
        Menu m = new Menu();
        m.add(new Dish("Shahi Paneer ", 342));
        m.add(new Dish("Kadai Paneer ", 400));
        m.display();
        System.out.println("*****************");
        m.remove("Shahi Paneer ");
        m.display();
        System.out.println("******************");
        m.updatePrice(new Dish("Kadai Paneer ", 500));
        m.display();

    }

}
