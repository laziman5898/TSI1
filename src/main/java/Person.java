import java.util.ArrayList; // import the ArrayList class

public class Person {
    public String name ;
    public int age ;
    public BankSystem bank;
    public ArrayList<String> listOfTransactions ;

    public Person (String name , int age) {
        this.name = name ;
        this.age = age ;
        bank = new BankSystem(0) ;

        listOfTransactions = new ArrayList<>() ;
    }
    public void depositMoney(float depositAmount){
        bank.balance += depositAmount;
        System.out.println("Deposit Successful");
    }
    public void transaction(float itemAmount,String statement){
        bank.balance-= itemAmount;
        listOfTransactions.add(statement) ;
        System.out.println("Transaction Successful");
    }
    public ArrayList transactionHistory() {
        return listOfTransactions ;
    }
    public void displayBalance () {
        System.out.println(bank.balance);
    }
}
