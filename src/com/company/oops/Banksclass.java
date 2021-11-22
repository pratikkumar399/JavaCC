package oops;

abstract class Bank {
    public abstract void getBalance() ;
}

class BankA extends Bank {
    public void getBalance(){
        System.out.println("100$ balance in Bank A");
    }
}
class Bankb extends Bank {
    public void getBalance(){
        System.out.println("100$ balance in Bank b");
    }
}
class BankC extends Bank {
    public void getBalance(){
        System.out.println("100$ balance in Bankc");
    }
}

public class Banksclass {
    public static void main(String[] args) {
        BankA obj1 = new BankA() ;
        Bankb obj2 = new Bankb() ;
        BankC obj3 = new BankC() ;
          
        obj1.getBalance();
        obj2.getBalance();
        obj3.getBalance();

    }
}
