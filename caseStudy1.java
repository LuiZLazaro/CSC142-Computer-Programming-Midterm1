package midterm;
import java.util.Scanner;

public class caseStudy1 {

	public static void main(String[] args) 
	{
		// get user input...
		Scanner input = new Scanner(System.in);
		System.out.print("Enter salary:");
		double salary = input.nextDouble();
		System.out.print("Enter credit rate: ");
		int rate = input.nextInt();
		
		// logic control...
		if(salary>=20000 && rate>=7) 
		{
			qualify();			
		}else 
		{
			noQualify();
		}
		input.close();
	}
	// 2 void methods...
	public static void qualify() 
	{
		System.out.print("You Qualify for it!");
	}
	public static void noQualify() 
	{
		System.out.print("You don't Qualify!");
	}
}
