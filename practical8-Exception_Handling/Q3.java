
public class FirstException
{
	FirstException(String msg)
    {
    	msg="this is bound to execute";
        System.out.println(msg);
    }
    public static void main(String[] args) throws CreateException
    {
    	try
        {
        	throw new CreateException();
        }
        catch(CreateException e)
        {
        	e.printStackTrace();
        }

        finally
        {
        	System.out.println("i will get printed");
        }
    }
}
