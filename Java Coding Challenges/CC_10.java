import java.util.Scanner;
public class CC_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: x1,y1,x2,y2 ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float x = x2-x1;
        float y = y2-y1;
        double distance = Math.sqrt(x*x+y*y);
        System.out.print("Output"+ distance);
	}

}
