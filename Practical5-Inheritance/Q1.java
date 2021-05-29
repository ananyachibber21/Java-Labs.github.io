class Shape
{
	void printt()
	{
		System.out.println("This is shape");
	}
}

class Rectangle extends Shape
{
	void printt()
	{
		super.printt();
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape
{
	void printt()
	{
		System.out.println("This is circular shape");
	}
}

class Square extends Rectangle
{
	void printt()
	{
		super.printt();
		//System.out.println("Square is a rectangle");
	}
}

class Driver
{
	public static void main(String args[])
	{
		Square obj = new Square();
		obj.printt();
	}
}
 
