interface A{
	public void print();
}

interface B
{
	public void check();
}

class C implements A,B{
	public void print(){
		System.out.print("Hello ");
	}

    public void check(){
		System.out.print("World");
	}
}

class SecondInterface
{
	public static void main(String args[])
	{
		C ob = new C();
		
		ob.print();
		ob.check();
	}
}

