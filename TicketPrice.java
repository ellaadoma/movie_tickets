// This program is used to calculate the price of a movie ticket given some conditions.
//author- Emmanuella Asomani.
//contact information- eaa2865@email.vccs.edu
// date of last modification- 09/16/21
import java.util.Scanner;
public class TicketPrice
{
    static Scanner scan = new Scanner(System.in);
    static String[] timeTimings={"11:00 am","1:00 pm","3:00 pm","6:00 pm","9:00 pm","11:00 pm"}; // array of the movie times
	public static void main(String[] args)
	{
		int age;
		int time;
		double ticketPrice  = 0;
		String filmFestival;
		
		System.out.println("WELCOME TO THE MOVIE THEATER!!!");
		System.out.println("Is your movie of choice part of the film festival. yes or no?");
		filmFestival = scan.nextLine();
		System.out.println("How old are you?");
		age = scan.nextInt();
		System.out.println("What time would you like to watch your movie?\n"
				+ "1. 11:00 am\n"
				+ "2. 1:00 pm\n"
				+ "3. 3:00 pm\n"
				+ "4. 6:00 pm\n"
				+ "5. 9:00pm\n"
				+ "6. 11:00 pm");
		time = scan.nextInt();
		
		if(filmFestival.equalsIgnoreCase("yes"))
			ticketPrice=15;
			else
			{
			if(time>=4)
			ticketPrice=18;
			else
			ticketPrice=12;
			if(age>=60)
			ticketPrice=ticketPrice-(ticketPrice *0.1);
			if(age<=12)
			ticketPrice=10;
			}

			System.out.println("Festival:"+filmFestival);
			System.out.println("Age: "+age);
			System.out.println("timetiming:" +timeTimings[time-1]);
			System.out.println("Ticket Price: $"+ticketPrice);
	}
}
		
