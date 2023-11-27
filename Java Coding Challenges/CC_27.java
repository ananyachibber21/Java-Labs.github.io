import java.util.Scanner;
import java.lang.Math;
public class CC_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int binary = sc.nextInt();  
		System.out.print("Output: "+ to_decimal(binary));
	}
	
	public static double to_decimal(int binary) {
		int last;
		double decimal=0;
		int i = 0;
		while(binary!=0) {
			last = binary%10;
			decimal = decimal + last*Math.pow(2, i);
			i++;
			binary = binary/10;
		}
		return decimal;
	}
}
