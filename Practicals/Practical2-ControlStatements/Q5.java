import java.util.Scanner;
import java.lang.Math;

class Series
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("n: ");
        double n = sc.nextDouble();
        double sum = 1;
        double fact = 1;
        double term;
        double tot;
        for(int i=1; i<=n; i++){
            fact = fact * i;
            term = Math.pow(x,i);
            tot = term/fact;
            sum = sum + tot;
        }
        System.out.println("Sum of the series: "+ sum);
    }
}
