interface A{
	public void print();
}

class B
{
	void check(){
		System.out.print("Hello ");
	}
}

class C extends B implements A{
	public void print(){
		System.out.print("World");
	}
}

class FirstInterface
{
	public static void main(String args[])
	{
		C ob = new C();
		ob.check();
		ob.print();
	}
}

