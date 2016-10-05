public class HWrecurse
{
	public static void main(String[] args)
	{
		five(5);
	}
	
	public static void five(int n)
	{
		if ( n > 0)
		{
			five(n-1);
		}
		System.out.println(n);
			
		
		
		
	}
}

		
		