import java.util.Scanner;
public class CC_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		int sum = 0;
		while(n!=0) {
			int x = n%10;
			sum=sum+x;
			n = n/10;
		}
		System.out.print("Output: "+sum);
	}
}
