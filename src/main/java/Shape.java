import java.sql.SQLOutput;

/**Construct a superclass called "Shape" with methods to calculate the area and
 perimeter. Create subclasses such as "Rectangle" and "Circle" that inherit from
 the Shape class and implement their specific area and perimeter calculations.**/
abstract class SuperShape{
    abstract float area();
    abstract float preimeter();
}

class Rectangle extends SuperShape{
    float l,b;

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getL() {
        return l;
    }

    public Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }

    public void setL(float l) {
        this.l = l;
    }
    @Override
    float area(){
        return this.l*this.b;
    }
    @Override
    float preimeter(){
        return 2*(this.l+this.b);
    }
}

class Circle extends SuperShape{
    float r; //radius

    public Circle(float r) {
        this.r = r;
    }

    @Override
    float preimeter() {
        return (float) ((2*3.14)*this.r);
    }

    @Override
    float area() {
        return (float) (3.14*this.r*this.r);
    }
}
public class Shape {
    public static void main(){
        SuperShape rect = new Rectangle(2,2);
        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Preimeter of Rectangle : " + rect.preimeter());
        Rectangle re  = (Rectangle) rect;
        re.setB(4);
        re.setL(4);
        System.out.println("Area is : " + rect.area());
        System.out.println("*******************");
        SuperShape circ = new Circle(2);
        System.out.println("Area of circle : " + circ.area());
        System.out.println("Preimeter of circle : " + circ.preimeter());
    }
}
