import java.util.Scanner;
class Bankaccount{
    private double balance;
    public Bankaccount(double initialbalance){
        this.balance=initialbalance;
    }
    // to deposit the money

    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Depoisiting is successfull and the current balance is $ " +balance);

        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawa; successful remaining balance is $" + balance);
            return true;
        }
        else if(amount>balance){
            System.out.println("Insufficient balance");
            return false;
        }
        else{
            System.out.println("Invalid withdrawal amount");
            return false;
        }
    }
    public double getbalance(){
        return balance;
    }
}
class ATM{
    private Bankaccount account;
    private Scanner scanner;
    public ATM(Bankaccount account){
        this.account=account;
        this.scanner=new Scanner(System.in);
    }
    public void showMenu(){
        while (true) { 
            System.out.println("--------ATM MENU----------");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.withdraw");
            System.out.println("4.exit");
            System.out.println("Choose an option:");
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                  System.out.println("Current Balance: $ "+account.getbalance());
                  break;
                case 2:
                  System.out.println("Enter the deposit amount: ");
                  double depamount=scanner.nextDouble();
                  account.deposit(depamount);
                  break;
                case 3:
                  System.out.println("Enter the withdrawal amount: ");
                  double withdrawamount=scanner.nextDouble();
                  account.withdraw(withdrawamount);
                  break;
                case 4:
                  System.out.println("Thank you for using ATM...");
                  return;
                default:
                  System.out.println("Invalid choice.Please select a valid one");        
            }
        }
    }
}
public class task3 {
   public static void main(String[] args) {
    Bankaccount useraccount=new Bankaccount(500);
    ATM atm=new ATM(useraccount);
    atm.showMenu();    
   } 
}
