import java.util.*;

public class CC_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		int mod = n1 % n2;
		System.out.printf("Output: Sum: %d Sub: %d Mul: %d Div: %d Mod: %d", sum, sub, mul, div, mod);
	}

}
