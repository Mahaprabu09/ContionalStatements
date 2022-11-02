package Conditionalstatements;
import java.util.Scanner;
/*Ask for a number from the user for which he wants to print a table. 
 * The message should be "Please enter the number for which you want to print the table:
 * Store that number in a variable n, create a method printTheTable,
 *  for calculating and printing the table for n USe Scanner method for accepting th input from the user.
 */
public class getUserInput {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number for which you want to print the table");
		int n=sc.nextInt();
		printTable(n);

	}

	static void printTable(int n)
	{
		int table;
		for(int i=1;i<=10;i++)
		{
			table=n*i;
			System.out.println(n+" * "+i+" = "+table);
		}
	}

}
