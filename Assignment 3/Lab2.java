import java.util.Scanner;

		  public class Lab2 {
		   
		                  public static void main(String[] args) {
		                                  Scanner myKeyboard = new Scanner(System.in);
		                                  double tax = 0;
		                                  int portion1 = 48000;
		                                  int portion2 = 49000;
		                                  int portion3 =53000;
		                                  int portion4 = 64000;
		                                  System.out.print("Input your income: ");
		                                  int userIncome = myKeyboard.nextInt();
		                                  if(userIncome>214000)
		                                  {
		                                                  tax = portion1 * 0.15;
		                                                  tax = tax +(portion2*0.205);
		                                                  tax = tax +(portion3*0.26);
		                                                  tax = tax +(portion4*0.29);
		                                                  int portion5 = userIncome - 214000;
		                                                  tax = tax +(portion5*0.33);
		                                                  
		                                  }
		                                  else if(userIncome>150000&&userIncome<=214000)
		                                  {
		                                                  tax = portion1 * 0.15;
		                                                  tax = tax +(portion2*0.205);
		                                                  tax = tax +(portion3*0.26);
		                                                  int portion5 = 214000-userIncome;
		                                                  tax = tax +(portion5*0.29);
		                                  }
		                                  else if(userIncome>970000&&userIncome<=150000)
		                                  {
		                                                  tax = portion1 * 0.15;
		                                                  tax = tax +(portion2*0.205);
		                                                  int portion5 = 150000-userIncome;
		                                                  tax = tax +(portion5*0.26);
		                                  }
		                                  else if(userIncome>480000&&userIncome<=97000)
		                                  {
		                                                  tax = portion1 * 0.15;
		                                                  int portion5 = 97000-userIncome;
		                                                  tax = tax +(portion5*0.205);
		                                  }
		                                  else if(userIncome <= 48000)
		                                  {
		                                                  tax = 0.15*userIncome;
		                                  }
		                                  System.out.println("Tax amount is: "+tax);
		                                  myKeyboard.close();
		                  }


}
