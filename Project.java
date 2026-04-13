class Wallet{
    private double balance;
    static double cashback = 0.02;

    double GettergetBalance(){
        return balance;
    }

    void deposite(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
public class Project{
    public static void main(String[] args){
        
    }
}