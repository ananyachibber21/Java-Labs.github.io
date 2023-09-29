import java.util.Scanner;
public class CC_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=2; i<=n; i++) {
		    fact = fact*i;
		}
		System.out.print("Output: "+ fact);
	}

}
