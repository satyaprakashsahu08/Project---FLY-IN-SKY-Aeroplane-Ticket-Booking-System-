
package MAIN;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class leader {
	Scanner sc = new Scanner(System.in);
	
	public int ShowHome()
	{
		int option=0;
		System.out.println("*********************************************************");
		System.out.println("\t\tWELCOME TO FLY IN SKY AIRLINES");
		System.out.println("*********************************************************");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd                                       HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println("*********************************************************");

		System.out.println("->Please Select Among One Of This Options : ");
		System.out.println("1.Book Ticket's \n2.Help \n3.Exit");
		System.out.println("Enter Here : ");
		try
		{
		option = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
		    
			System.out.println("\nInvalid Option ! check Again :( \n");
			return new leader().ShowHome();

		}		
		return option;
		
	}
	public void GetDetails() throws Exception
	{
		int option = new leader().ShowHome();
		
		if(option==1)
		{
			new Ticket_Booking().PlanesDetails();
		}
		else if(option==2)
		{
			new help().helpdesk();
		}
		else if(option==3)
		{
			
			new end().End();			
		}
		else 
		{
			System.out.println("INVAlID INPUT !.Please Cheak Again ");
			new leader().GetDetails();
		}
	}
	


}
