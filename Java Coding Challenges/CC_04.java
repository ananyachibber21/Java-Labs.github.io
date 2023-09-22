import java.util.*;
public class CC_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3;
        n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.printf("Output: n1=%d n2=%d", n1, n2);
	}

}
