import java.util.Scanner;
public class CC_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1>n2) {
			System.out.printf("Min=%d Max=%d", n2, n1);
		}
		else {
			System.out.printf("Min=%d Max=%d", n1, n2);
		}

	}

}
