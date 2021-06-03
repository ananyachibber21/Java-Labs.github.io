abstract class Bank
{
    abstract int getBalance(int deposit);
}

class BankA extends Bank{

    int getBalance(int balance){
        return balance;
    }
}

class BankB extends Bank{

    int getBalance(int balance){
        return balance;
    }
}

class BankC extends Bank{

    int getBalance(int balance){
        return balance;
    }
}

class BankInterface
{
    public static void main(String args[]){
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        int aBank;
        int bBank;
        int cBank;

        aBank=a.getBalance(100);
        bBank=b.getBalance(150);
        cBank=c.getBalance(200);

        System.out.println("$"+ aBank);
        System.out.println("$"+ bBank);
        System.out.println("$"+ cBank);
    }
}
