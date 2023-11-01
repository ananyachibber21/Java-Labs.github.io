import java.util.Scanner;
public class CC_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Input: ");
			int sum = 0;
			int n = sc.nextInt();
			for(int i=2; i<=n; i=i+2) {
				sum=sum+i;
			}		
			System.out.print("Output "+ sum);
		}
	}
