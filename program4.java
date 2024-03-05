import java.util.*;
class program4
{
// function for sum 
  public static int sum (int n)
  {
	int sum = 0, i = 0;
	while (i <= n)
	  {
		sum = sum + i;
		i++;
	  }
	return sum;
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
	System.out.println (sum (n));

  }

}
