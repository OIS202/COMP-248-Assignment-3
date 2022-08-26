//-------------------------------------------------------------
//This program was designed to read numbers and assign it to a 1D array with 10 elements and then eliminate any repeated numbers in the array and output the unique numbers
//Assignment 3
//Written by: Omar Ihab Mohammed Aboubakr Abdalla Shehata (Student ID:40164193)
//For COMP 248 Section R - Fall 2020
//Started Writing program on 03/11/2020
//Finished writing on /11/2020
//-------------------------------------------------------------
import java.util.Scanner;//We need to import class in which scanner is 
//in
public class DuplicationElimination {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);//declaring the
		//scanner
		final int NUMBER_OF_NUMBERS = 10;//declaration of the amount of the numbers that will be read and be inputed into the array
		int[] numbers = new int[NUMBER_OF_NUMBERS];//declaration of array of numbers
		for (int i=0;i<numbers.length;i++){numbers[i] = 1;}//loop to initialise array with 1
		int inputNumber = 10;//Initialising of input number and declaration
		int i = 0;//declaration of the loop counter
		while(inputNumber>=10 && inputNumber <= 100 && i<10)
		{
			do//loop to enter the values of the numbers
			{
				System.out.println("Enter a number between 10 and 100 (inclusive): ");
				System.out.print("Value" + i + ": ");
				inputNumber = myKeyboard.nextInt();
				if (inputNumber<10 || inputNumber>100)
				{
					System.out.println("Wrong value, please input a value in [10,100]: ");
				}
			}while (inputNumber<10 || inputNumber>100);
			numbers[i] = inputNumber;
			i++;
		}
		for(int n=0;n<numbers.length;n++)//for loops to check if there's duplication and eliminate it
		{
			for(int m=0;m<numbers.length;m++)
			{
				if(numbers[n]==numbers[m]&&n!=m)
				{
					int v =0;
					v= numbers[n];
					for(int z = m;z<numbers.length;z++)
					{
						if(v==numbers[z])
						{
							numbers [z] = 1;
						}
					}
				}
			}
		}		
			System.out.println("The unique numbers are: ");
			for(int n = 0;n<numbers.length;n++)//loop to output all unique numbers in array
			{
				if (numbers[n]!= 1)
				{
					System.out.print(numbers[n] + ", ");
				}
			}
		System.out.println("Thank you for using our program.");//closing message
		myKeyboard.close();//closing the scanner
	}

}
