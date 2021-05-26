class Triangle
{
    int length;
    int breadth;

	int area(){
		int a = length*breadth;
		return a;
	}

	int perimeter(){
		int p = 2*(length+breadth);
		return p;
	}
}

class Triangles
{
	public static void main(String args[])
	{
		Triangle t = new Triangle();
		t.length = 10;
		t.breadth = 20;
        t.area();
        t.perimeter();
        System.out.println("Enter area: "+ t.area());
        System.out.println("Enter perimeter: "+ t.perimeter());
	}
}
