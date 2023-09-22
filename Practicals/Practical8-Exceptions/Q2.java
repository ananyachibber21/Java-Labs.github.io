import java.util.*;
class CheckArgument extends Exception{}
class CheckException
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the no of argument you want to add: ");
		int n = sc.nextInt();
		int s[] = new int[n];

		try{
			for(int i=0;i<5;i++){
				System.out.println("Enter an argument: ");
                s[i] = sc.nextInt();
                if(s.length<5){
                	throw new CheckArgument();
                }
                else{
                	sum = sum + s[i];
                }
			}
		}
		catch(CheckArgument e){
			System.out.println("Pass 5 arguments");
		}
		System.out.println("The sm is "+sum);
	}
}
