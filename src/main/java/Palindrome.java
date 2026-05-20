import java.util.Scanner;

public class Palindrome {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String whose you want to check if its a palindrome or not: ");
        String data =  sc.next();
        boolean flag = true;
        //System.out.println(data);
        if( (data.length() %2 )==0 ){
            //System.out.println("Even " + (data.length() /2));
            for(int i = 0; i < (data.length() / 2); i++){
//                System.out.println("In Loop");
                if(data.charAt(i) != data.charAt((data.length() -1- i))){
                    //System.out.println("Not a Palindrome");
                    flag=false;
                    break;
                }
            }
        }else{
            //System.out.println("Odd");
            for(int i = 0; i < ((data.length()-1) / 2) ; i++){
//                System.out.println("In Loop");
                if(data.charAt(i) != data.charAt((data.length() -1- i))){
                    //System.out.println("Not a Palindrome");
                    flag=false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("Data " + data + " is a Pallindrome");
        }else{
            System.out.println("Data " + data + " is not a pallindrome");
        }

    }
}
