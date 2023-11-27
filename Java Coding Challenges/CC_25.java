import java.util.Scanner;
public class CC_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
        String str = sc.nextLine();
        System.out.print("Output: "+palindrome(str));
	}
	
	public static boolean palindrome(String str) {
		String rev = "";
		int len = str.length();
		for(int i = len; i>=1; i--) {
			rev = rev + str.substring(i-1,i);
		}
		if(str.equals(rev)) {
			return true;
		}
		else {
			return false;
		}
	}
}
