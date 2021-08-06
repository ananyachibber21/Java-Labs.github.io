import java.util.Scanner;

class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = sc.nextLong();
        if(num>=-128 && num<=127){
            System.out.println("Number in byte");
        }
        else if(num>=-(Math.pow(2,16-1)) && num<=(Math.pow(2,16-1)-1)){
            System.out.println("Number in short");
        }
        else if(num>=-(Math.pow(2,32-1)) && num<=(Math.pow(2,32-1)-1)){
            System.out.println("Number in int");
        }
        else{
            System.out.println("Number in long");
        }
    }
}
