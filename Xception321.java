import java.util.Scanner;
 +
 +public class Xception5 {
 +	public static void main(String[] args) {
 +		
 +	
 +	Scanner sc = new Scanner (System.in);
 +	int x= inputInt ("Enter a number : ");
 +	System.out.println();
 +	if (x>10)
 +	{
 +		throw new MyException2();
 +	}
 +	}
 +	
 +	
 +	
 +	
 +	public static int inputInt(String m)
 +	{
 +	Scanner sc = new Scanner (System.in);
 +		System.out.println(m);
 +		return sc.nextInt();
 +	}
 +
 +}
 +class MyException2 extends RuntimeException
 +{
  }
 +	