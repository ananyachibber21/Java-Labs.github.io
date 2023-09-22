package Exercises.Java;

class packageDemo{
	void display()
	{
		System.out.println("Package Demo executed");
	}
}

class PackageDemoDriver
{
	public static void main(String args[])
	{
		packageDemo ob = new packageDemo();
		ob.display();
	}
}
