import java.util.Scanner;
import java.io.*;
public class Multiplication_table 
{
	public static void main(String[] args) throws IOException
	{

		Scanner input= new Scanner(System.in);
		int number=0;
		//==========validation for input number==========
		do
		{
			System.out.print("Type in an upper limit (1-99)> ");
			number=input.nextInt();
		}while(number<=0 || number>=100);

		String fileName = ("MultiplicationTable"+number+".txt");

		// declare to write the file
		PrintWriter outFile = new PrintWriter(fileName);

			//========printing the top=
				for (int i=1;i<=number;i++){
					if (i==1) {
						outFile.printf("%4s|", " ");// top column (header)
					}
					outFile.printf("%4d|", i);// bars in between numbers
				}
				outFile.println();
				for (int i=1;i<=(number+1);i++){
					outFile.printf("%4s", "----|");//a line separates from header with output number
				}
				outFile.println();

			//=================filling in the table up to the limit==
				int multiplicand=1;
				do {
					outFile.printf("%4d|", multiplicand);
					for (int mutiplier=1;mutiplier<=number;mutiplier++){
						int product = (multiplicand*mutiplier);
						outFile.printf("%4d|", product);
					}
					multiplicand++;
					outFile.println();
				} while (multiplicand<=number);

			outFile.close();
			// notify the user
			System.out.println("Your file \""+fileName+"\" is ready");
 
	}
}