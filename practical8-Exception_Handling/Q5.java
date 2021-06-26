class CreateException extends Exception{}

class Object{
	void use(String val) {
		System.out.println("The string is "+val);
	}
}

class SecondException
{
	public static void main(String args[]){
        Object obj = new Object();
        try{
        	obj.use("Ananya");
        	throw new CreateException();
        }
        catch(CreateException e){
        	e.printStackTrace();
        }

	}
}
