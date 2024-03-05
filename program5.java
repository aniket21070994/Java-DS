import java.util.*;
class program5
{
// function for pattern
  public static void pattern (int n)
  {
	int j, i = 0;
	while (i <= n)
	  {
		j = 0;
		while (j <= i)
		  {
			System.out.print ("*");
			j++;
		  }
		System.out.println ("");
		i++;
	  }

  }
//main function
  public static void main (String[]args)
  {
	//creating Scanner object to use integer input function 
	Scanner sc = new Scanner (System.in);
	System.out.println ("enter number till sum");
	//gaing input from user
	int n = sc.nextInt ();
	//calling and printing static function called sum
	pattern (n);

  }

}
