import java.util.Scanner;
public class CC_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int year = sc.nextInt();
		if(year%4==0) {
			System.out.print("Output: "+ true);
		}
		else {
			System.out.print("Output: "+ false);
		}

	}

}
