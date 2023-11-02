import java.util.Scanner;
public class CC_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		int rev = 0;
		while(n!=0) {
			int x = n%10;
			rev = rev*10+x;
			n = n/10;
		}
		System.out.print("Output: "+rev);
	}
}
