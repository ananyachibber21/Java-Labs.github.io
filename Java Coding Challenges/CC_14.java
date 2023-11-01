import java.util.Scanner;
public class CC_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		int flag = 0;
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				flag++;
				break;
			}	
		}
		if(flag==0) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}
	}
}
