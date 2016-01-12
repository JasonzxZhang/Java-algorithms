import java.util.Scanner;
public class PrimeNumberGenerator{
	public static void main(String[] arg){
		int lowerLimit, upperLimit;
		boolean isPrime;
		Scanner input= new Scanner(System.in);
		System.out.println("This program will generate prime numbers from slected range!");
		//input range validation
		do{
			System.out.print("Please type in the lower limit (2 or above):");
			lowerLimit=input.nextInt();
		}while(lowerLimit<2);
		do{
			System.out.printf("Please type in the upper limit (%d or above):",lowerLimit+1);
			upperLimit=input.nextInt();
		}while(upperLimit<=lowerLimit);

		//prime validation
		for (int number=lowerLimit;number<=upperLimit;number++){
			isPrime=true;
			for (int divisor=2;divisor<number;divisor++)
				if(number%divisor==0)
					isPrime=false;
			if(isPrime==true)
				System.out.print(number+" ");
		}
	}
}
