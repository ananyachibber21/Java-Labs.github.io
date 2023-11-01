import java.util.Scanner;
public class CC_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Input: ");
			int sum = 0;
			int n = sc.nextInt();
			for(int i=1; i<=n; i++) {
				sum=sum+i;
			}		
			System.out.print("Output"+ sum);
		}
	}
