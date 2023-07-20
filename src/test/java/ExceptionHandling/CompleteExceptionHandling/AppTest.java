package ExceptionHandling.CompleteExceptionHandling;

public class AppTest 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4};
		int a=10,b=0,c;		
				
			try
			{
				try
				{
					arr[100]=900;
					System.out.println("arr->result: "+arr[100]);													
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
				finally
				{
					System.out.println("internal finally Always get executed");
				}
								
				c = a / b;
				
				System.out.println("Result: "+c);
							
			}
			catch(ArithmeticException e)			
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("external finally Always get executed");
			}
				
	}	
}