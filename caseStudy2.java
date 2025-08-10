package midterm;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class caseStudy2 
{
	public static void main(String[] args) throws IOException
	{
		Scanner consoleIn = new Scanner(System.in);
		// calling the methods setting the parameters...
		String filename = fileName(consoleIn);
		double total = getSales(filename);
		double average = total/30;
		displayResult(total, average);
		consoleIn.close();	
	}
	// get the file from use and return a value to process...
	public static String fileName(Scanner consoleIn) 
	{
		System.out.print("Enter file name: ");
		return consoleIn.nextLine().trim();
	}
	// read the file to add into a variable and return a value...
	public static double getSales(String filename) throws IOException
	{
		double total=0.0;
		File file = new File (filename);
		Scanner fileIn = new Scanner(file);
		
		// control loop to read the data...
		while(fileIn.hasNextDouble()) 
		{
			total+=fileIn.nextDouble();
		}
		fileIn.close();
		return total;
	}
	//Set the display message getting parameters from the main method...
	public static void displayResult(double total, double average) 
	{
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
	}
}
