import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ItsAClass{

}

@ItsAClass
class Animals{
    public void speak(){
        System.out.println("Animals Speak");
    }
}
@ItsAClass
class Cat extends Animals{
    @Override
    public void speak(){
        System.out.println("Cat Meows");
    }
}

public class Annotations {
    void main(){
        Animals a = new Cat();
        a.speak();
    }
}
