import java.util.Scanner;
public class CC_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
        String str = sc.nextLine();
        System.out.print(is_reverse(str));
	}
	
	public static String is_reverse(String str) {
		String rev = "";
		int len = str.length();
		for(int i = len; i>=1; i--) {
			rev = rev + str.substring(i-1,i);
		}
		return rev;
	}
}
