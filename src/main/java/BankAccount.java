import java.sql.SQLOutput;

//Design an abstract class "BankAccount" with abstract methods for deposit,
//withdrawal, and displayBalance. Create concrete subclasses like
//"SavingsAccount" and "CheckingAccount" that extend the BankAccount class
//and implement these methods.
abstract class BA{
    abstract void deposit(int amount);
    abstract void withdrawal(int amount);
    abstract void displayBalance();
}

class SavingsAccount extends BA{
    private int money;

    SavingsAccount(int amount){
        this.money = amount;
    }

    @Override
    void deposit(int amount) {
        this.money = this.money+amount;
    }

    @Override
    void withdrawal(int amount) {
        if(this.money>amount) {
            this.money = this.money - amount;
            System.out.println("Updated Balance is " + this.money);
        }else{
            System.out.println("Insufficient Balance to complete request. Your available balance is " + this.money );
        }
    }

    @Override
    void displayBalance() {
        System.out.println(this.money);
    }
}


public class BankAccount {
    void main(){
        SavingsAccount s = new SavingsAccount(444);
        s.deposit(444);
        s.withdrawal(1000);
        //s.displayBalance();
    }


}
