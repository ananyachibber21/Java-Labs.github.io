import java.util.*;
public class CC_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Input: ");
			int sum = 0;
			int n = sc.nextInt();
			for(int i=1; i<n; i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			if(sum==n) {
				System.out.print("Output: true");
			}
			else {
				System.out.print("Output: false");
			}
		}

	}
