import java.util.*;
public class PatternAscending {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the no of rows: ");
		int n = console.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
