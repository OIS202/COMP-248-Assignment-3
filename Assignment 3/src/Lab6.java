import java.util.Scanner;                    
public class Lab6 {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		System.out.println("Enter a string of digits: ");
		String inputNumber = myKeyboard.nextLine();
		String[] numbers = new String[inputNumber.length()];
		for(int i = 0;i<numbers.length;i++)
		{
			numbers[i]=inputNumber.substring(i, i+1);
		}
		for(int i = 0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		for(int i = 0;i<numbers.length-1;i++)
		{
			System.out.print(numbers[i]);
			for(int m = 0;m<inputNumber.length();i++)
			{
				System.out.print(" ");
			}
			System.out.print(numbers[numbers.length-i]);
		}
		for(int i = 1;i<numbers.length;i++)
		{
			System.out.print(numbers[numbers.length-i] + " ");
		}
		myKeyboard.close();
		

	}

}
