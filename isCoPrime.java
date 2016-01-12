import java.util.Scanner;
import java.lang.*;
public class isCoPrime{
	public static void main(String[] args){
	int number1,number2,checkBound;
	Scanner input= new Scanner(System.in);

		System.out.print("Please type in the first number: ");
		number1=input.nextInt();
		do{
			System.out.printf("Please type in the second number(other than %d):",number1);
			number2=input.nextInt();
		}while(number2==number1);

		if(number1<number2)
			checkBound=number1;
		else
			checkBound=number2;

	//main algorithm
		for(int divisor=2;divisor<=checkBound;divisor++)
			if((number1%divisor==0)&&(number2%divisor==0)){
				System.out.printf("%d and %d are NOT coprime", number1,number2);
				System.exit(0);
			}
		System.out.printf("%d and %d ARE coprime with each other!", number1,number2);
	}
}