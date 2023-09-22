import java.util.Scanner;
public class CC_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int min = n1<n2 && n1<n3 ? n1 : n2<n1 && n2<n3 ? n2 : n3;
		int max = n1>n2 && n1>n3 ? n1 : n2>n1 && n2>n3 ? n2 : n3;
		System.out.printf("Min = %d Max = %d", min, max);
	}

}
