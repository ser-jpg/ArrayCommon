package methods;

public class BankAccount {

    String accountNumber;
    String accountName;
    double balance;

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

     void bankAccount(){

        System.out.println(accountName);
         System.out.println(accountNumber);
         System.out.println(balance);

    }
    void getDeposite(int depo){

        balance=balance+depo;
        System.out.println("Bakiye="+balance);
    }
    void getWithDraw( int withdraw){

        if(withdraw<=balance){
            balance= balance-withdraw;
            System.out.println("WithDraw="+withdraw);
            System.out.println("New Bakiye="+balance);
        }
        else{
            System.out.println("Bakiyeniz yetersiz... Yours bakiye="+balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount("123456","Serkan",3500);

        account.bankAccount();
        account.getDeposite(1000);
        account.getWithDraw(3000);
    }

}
