/*
Java Hello World example.
*/
 
public class HelloWorldExample{
 
public static void main(String[] args)
	{	
 System.out.println("Hello World !");
final int NUM_FACTS = 5;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
 
}
 
/*
 
OUTPUT of the above given Java Hello World Example would be :
 
Hello World !
 
*/