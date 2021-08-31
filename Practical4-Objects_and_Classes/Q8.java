import java.util.Scanner;
class Relation{

    private int num1;
    private int den1;
    private int num2;
    private int den2;

    public Relation(int n1, int d1, int n2, int d2){
        num1 = n1;
        den1 = d1;
        num2 = n2;
        den2 = d2;
    }

    public void set_a(int n1, int d1){
        num1 = n1;
        den1 = d1;
    }

    public int get_a(){
        return num1/den1;
    }

    public void set_b(int n2, int d2){
        num2 = n2;
        den2 = d2;
    }

    public int get_b(){
        return num2/den2;
    }

    public int addition(){
        return get_a() + get_b();
    }

    public int subtraction(){
        return get_a() - get_b();
    }

    public int multiplication(){
        return get_a() * get_b();
    }

    public int division(){
        return get_a() / get_b();
    }
}
class RelationTest
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter denominator 1: ");
        int den1 = sc.nextInt();
        System.out.println("Enter numerator 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter denominator 2: ");
        int den2 = sc.nextInt();
        Relation rt = new Relation(num1, den1, num2, den2);

        System.out.println("Relation 1: "+ rt.get_a());
        System.out.println("Relation 2: "+ rt.get_b());
        System.out.println("Addition: "+ rt.addition());
        System.out.println("Subtraction: "+ rt.subtraction());
        System.out.println("Multiplication: "+ rt.multiplication());
        System.out.println("Division: "+ rt.division());
        
    }
}
