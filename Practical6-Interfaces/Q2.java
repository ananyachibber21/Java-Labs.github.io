abstract class Shape
{
	public abstract int RectangleArea(int length, int breadth);
	public abstract int SquareArea(int side);
	public abstract int CircleArea(int radius);
}

class Area extends Shape
{
	public int RectangleArea(int length, int breadth)
	{
		return length*breadth;
	}
	public int SquareArea(int side)
	{
		return side*side;
	}
	public int CircleArea(int radius){
		return 3*radius*radius;
	}
}

class InterfaceArea
{
	public static void main(String args[]){
		Area s = new Area();
		int rArea;
		int sArea;
		int cArea;
		rArea=s.RectangleArea(2,4);
		System.out.println("The area of rectangle is: "+rArea);
		sArea=s.SquareArea(5);
		System.out.println("The area of rectangle is: "+sArea);
		cArea=s.CircleArea(3);
		System.out.println("The area of rectangle is: "+cArea);
	}
}
