class Wallet{
    private double balance;
    static double cashback = 0.02;

    double GettergetBalance(){
        return balance;
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
public class Project{
    public static void main(String[] args){
        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet();
        w1.deposit(1000);
    }
}