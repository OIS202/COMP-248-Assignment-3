//-------------------------------------------------------------
//This program was designed to determine which lockers are open after 100 students have altered its status
//Assignment 3
//Written by: Omar Ihab Mohammed Aboubakr Abdalla Shehata (Student ID:40164193)
//For COMP 248 Section R - Fall 2020
//Started Writing program on 10/10/2020
//Finished writing on 11/10/2020
//-------------------------------------------------------------
public class LockerPuzzleGame {

	public static void main(String[] args) {
		final int NUMBER_OF_LOCKERS = 100;
		boolean[] lockersStatus = new boolean[NUMBER_OF_LOCKERS];//declaration of an array of 100 elements to compensate and absorb the 100 lockers status 
										  				//Its to record the status of each locker from 0 to 99, false denotes closed and true denotes open
		for (int s = 0; s < NUMBER_OF_LOCKERS; s++)//Initial for loop to open every locker with first student and then open locker 2 and close every other locker with student 2
		{
			if (s == 0)//if to check if we are at the first locker
			{
				for (int i=s;i<NUMBER_OF_LOCKERS;i++)//if s == 1 then it opens every locker, using a for loop 
				{
					lockersStatus[i]=true;//open every locker with index i
				}
			}
			else if (s == 1)//if to check if we are at the second locker
			{
				for (int i=s;i<NUMBER_OF_LOCKERS;i+=2)//if s == 2 close locker 2 and every other locker using a for loop 
				{
					lockersStatus[i]=false;//close every locker with index i
				}
			}
			else//else if locker isn't one or two  
			{	
				for(int i=++s;i<NUMBER_OF_LOCKERS;i+=i)//for loop to go through every s locker and change it ( open it if it was closed,close it if it was open)
				{
					lockersStatus[i]=!lockersStatus[i];
				}
			}
			
		}
		for(int i=0;i<NUMBER_OF_LOCKERS;i++)//runs through all lockers 
		{
			if (lockersStatus[i]==true)//if element in index i is true
			{
				System.out.println("Locker L"+ i + " is open" );//then output that this locker with this corresponding index is open
			}
		}
		


	}

}
