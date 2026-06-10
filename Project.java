import java.util.*;
class Wallet{
    private double balance;
    static double cashbackRate = 0.02;

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void transferTo(Wallet receiver, double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalAccessException("Invalid amount");
            }

            if (balance < amount) {
                throw new Exception("Insufficient balance");
            }

            balance -= amount;
            receiver.balance += amount;

            double cashback = amount * cashbackRate;
            balance += cashback;

            System.out.println("Transaction successful.");
            System.out.println("Cashback received: " + cashback);

        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
public class Project{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double depositAmount = sc.nextDouble();
        double transferAmount = sc.nextDouble();
        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet();
        
        w1.deposit(depositAmount);

        System.out.println("Initial Balance (W1): " + w1.getBalance());
        

        
        System.out.println("Transferring amount...");
        System.out.println();
        w1.transferTo(w2, transferAmount);

        System.out.println();
        System.out.println("Final Balance (W1): " + w1.getBalance());
        System.out.println("Final Balance (W2): " + w2.getBalance());
    }
}