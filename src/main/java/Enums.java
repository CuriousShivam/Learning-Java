import java.lang.reflect.Type;

enum Enum {
    FIRST, SECOND, THIRD;
    Enum(){
        System.out.println("Constructor Call");
    }

    public static void getEnum(){
        System.out.println(Enum.THIRD);
    }

}
public class Enums {
    void main(){
        System.out.println(Enum.THIRD);;
        Enum.getEnum();
    }
}
