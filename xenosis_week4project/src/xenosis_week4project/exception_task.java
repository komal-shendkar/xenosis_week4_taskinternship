package xenosis_week4project;

public class exception_task {

	public static void main(String[] args)
	{
		try
		{
			int a=40/0;
		}
		catch(ArithmeticException e) 
		{
           System.out.println("arithmetic exception"+e);	  
           }
		catch(ArrayIndexOutOfBoundsException e) 
		{
           System.out.println("ArrayIndexOutOfBoundsException exception"+e);	  
           }
		catch(Exception e) 
		{
           System.out.println("exception"+e);	  
           }

}
}
