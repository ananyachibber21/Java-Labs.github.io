import java.util.Scanner;
public class CC_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Input: ");
			double sum = 0;
			int n = sc.nextInt();
			for(int i=1; i<=n; i=i+1) {
				sum=sum+i;
			}		
			System.out.print("Output: "+ sum/n);
		}
	}
