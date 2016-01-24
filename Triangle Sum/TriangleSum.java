import java.io.*;
import java.util.Scanner;
public class TriangleSum{
	public static void main(String[] args)throws IOException{

		int index=0, currentNumberCount=0, tempHighest, maxSum=0;
		int[] numberBank= new int[100];
		Scanner scanner= new Scanner(new File("triangle.txt"));

		numberBank[index]=0;//there is only one number at 1st row

		while(scanner.hasNextInt()){
			tempHighest= scanner.nextInt();
			//storing the highest number to current index
			if(tempHighest>numberBank[index])
				numberBank[index]=tempHighest;
			currentNumberCount++;
			//Recursion method tells when to switch to the next row.
			//When numberCount goes up to total number of current row
			//will proceed to the next row. In this case, next index.
			//	~~	lineNumber = index + 1	~~						
			if(currentNumberCount==totalNumberCount(index+1)){
				index++;
			}
		}
		//adding up all the highest number from each row
		for(int number:numberBank)
			maxSum+=number;

		System.out.println("Max sum: "+maxSum);
	}

	//recursion method to calcuate the total number from current row
	//e.g. at 4th row, there are a total of 10 numbers
	public static int totalNumberCount(int lineNumber){
		if(lineNumber==1)
			return 1;
		else
			return lineNumber+totalNumberCount(lineNumber-1);
	}
}