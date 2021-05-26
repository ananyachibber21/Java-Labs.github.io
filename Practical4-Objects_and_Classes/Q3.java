import java.util.*;

class Area
{
	int length;
	int breadth;

	Area(int l,int b){
		length=l;
		breadth=b;
	}

	int returnArea(){
		return length*breadth;
	}
}

class FindingArea
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		int l,b;
		System.out.println("Enter length: ");
        l = console.nextInt();
        System.out.println("Enter breadth: ");
        b = console.nextInt();
        Area obj = new Area(l,b);
        System.out.println("The area of the rectangle: "+ obj.returnArea());
	}
}
