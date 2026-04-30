import java.sql.SQLOutput;
import java.util.Scanner;

//.Create a simple Java game where the computer generates a random number,
//and the user has to guess it within a certain number of attempts. Provide hints
//like "higher" or "lower" for incorrect guesses.
class Game {
    private int randomNum;

    public int generateNumber() {
        this.randomNum = (int) (Math.random() * 101);
        return this.randomNum;
    }

    public boolean guessTheNumber(int i) {
        boolean b = (i == this.randomNum);
        if (!b ) howClose(i);
        return b;
    }


    public void howClose(int i) {
        if (i < this.randomNum) {
            System.out.println("Go Higher ...");
        } else {
            System.out.println("Go Lower ...");
        }
    }
}

public class GuessTheNumberGame {
 static void main(){
    Game g = new Game();
    int i = g.generateNumber();
     System.out.println("Number is " + i);
    Scanner scan = new Scanner(System.in);
    for(int in = 0; in<=3;in++){
        System.out.println("Enter The Number :");
        boolean t = g.guessTheNumber(scan.nextInt());
        if (t) {
            System.out.println("You won the match");
            break;
        }
        else{
            System.out.println("try again");
    }
    }
}

}
