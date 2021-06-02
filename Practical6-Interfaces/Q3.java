/*interface Bank
{
	public void print()
}

class Bank1
{
	void getBalance(){
	System.out.println("Hey");
	}
}

class Bank2
{
	void getBalance(){
	System.out.println("Hello");
	}
}

class Bank3
{
	void getBalance(){
	System.out.println("Hi");
	}
}*/

abstract class Bank {

    abstract int getBalance();

    }

class BankA extends Bank {

    private int balance;

    void deposit(int money) {

        balance += money;

}


int getBalance() {

    return balance;

}

}

class BankB extends Bank {

    private int balance;

    void deposit(int money) {

        balance += money;

}


int getBalance() {

    return balance;

}

}

class BankC extends Bank {

    private int balance;

    void deposit(int money) {

       balance += money;

}


int getBalance() {

    return balance;

}

}

public class BankInterface {

    public static void main(String[] args) {

        BankA bankA = new BankA();

        BankB bankB = new BankB();

        BankC bankC = new BankC();

        bankA. deposit(100);

        bankB. deposit(150);

        bankC. deposit(200);

        System.out.println("Balance of Bank A = $"+BankA.getBalance());

        System.out.println("Balance of Bank B = $"+BankB.getBalance());

        System.out.println("Balance of Bank C = $"+BankC.getBalance());

    }

}
