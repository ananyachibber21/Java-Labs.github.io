class ExceptionOne extends Exception{}
class ExceptionTwo extends ExceptionOne{}
class ExceptionThree extends ExceptionTwo{}

class A
{
	void func() throws ExceptionOne{
		throw new ExceptionOne();
	}
}

class B extends A
{
	void func() throws ExceptionTwo{
		throw new ExceptionTwo();
	}
}

class C extends B
{
	void func() throws ExceptionThree{
		throw new ExceptionThree();
	}
}

class Main{
	public static void main(String[] args)
	{
		A a = new C();
		try{
			a.func();
		}
		catch(ExceptionThree e3){
			System.out.println("Caught e3");
		}
		catch(ExceptionTwo e2){
			System.out.println("Caught e2");
		}
		catch(ExceptionOne e1){
			System.out.println("Caught e1");
		}
		
		
	}
}
