import javax.lang.model.type.ErrorType;
import java.util.Scanner;

public class Calculator01 {
    static Scanner scan = new Scanner(System.in);

    public static Float[] takeInput() {

        Float[] f = new Float[2];
        for (int i = 0; i <= 1; i++) {
            System.out.println("Enter a number: ");
            f[i] = scan.nextFloat();
        }
        return f;
    }

    public static String operator() {
        System.out.println("Enter operator");
        return scan.next();
    }

    public static Float solve(Float[] f, String o) throws Exception {
        try {
            if (o.equals("+")) {
            return f[0] + f[1];
        } else if (o.equals("-")) {
            return f[0] - f[1];
        } else if (o.equals("*")) {
            return f[0] * f[1];
        } else if (o.equals("/")) {
            return f[0] / f[1];
        }
            throw new IllegalArgumentException("Unknown operator: " + o);
        }catch(Error e) {
        System.out.println(e.getCause());
        throw e;
        }
    }

    public static void main(String args[]) {
        Float[] f = takeInput();
        String o = operator();
        try{
            System.out.println("Result is : "+solve(f,o));
        } catch (Exception e){
            System.out.println("herre " + e);
        }
    }
}
