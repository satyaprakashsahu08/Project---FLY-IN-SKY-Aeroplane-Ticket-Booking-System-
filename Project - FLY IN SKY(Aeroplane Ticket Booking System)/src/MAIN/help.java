package MAIN;
import java.util.Scanner;
public class help {
Scanner sc = new Scanner(System.in);
	public void helpdesk() throws Exception
	{
		System.out.println("**************WELCOME TO HELPDESK OF FLY IN SKY**************");
		System.out.println("*************************************************************");
		System.out.println("1.INFORMATION.\n2.Q&A.\n3.CONTACT.\n4.MAIN MENU");
		System.out.print("ENTER HERE : ");
		int options = sc.nextInt();
		if(options==1)
		{
			System.out.println("************************INFORMATION************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(" We can provide various services to airports, which are currently \n seeing greater and greater volumes of business associated with \n conditions such as the tremendous rise in the number of inbound \n visitors.  These are divided into passenger handling (customer \n service operations) and  ground handling (baggage and cargo \n loading/unloading, aircraft  marshaling, etc.), which are performed \n at various sites within  airports by our expert staff members, who \n possess outstanding experience and expertise, advanced specialized \n knowledge, and the unique KONOIKE spirit of hospitality.  Since we \n have  continued to provide safe services with high added value for over \n 20 years, we have gained an outstanding reputation from clients at\n major airlines and airports.");
		    System.out.println("------------FOUNDER & CEO. - *MR.SATYAPRAKASH SAHU*---------");
		    System.out.println("1.MAIN MENU.\n2.EXIT.");
		    System.out.print("ENTER HERE : ");
			int deci = sc.nextInt();
			if(deci==1)
			{
				new leader().GetDetails();
			}
			else
			{
				new end().End();
			}
		}
		else if(options==2)
		{
			System.out.println("1.How do I cancel or change my reservation?");
			System.out.println("ANS.The View/Change booking option on the Fly In Sky website is "
					+ "\n   available on the homepage. It is a self-service tool designed for your"
					+ "\n   assistance which eliminates the need to check and modify bookings via"
					+ "\n   call centers. The website lets customers retrieve and re-print itineraries,"
					+ "\n   add special service requests, and even update contact information.");
			System.out.println("**************************************************************************************************");
		System.out.println("2.Some things you can do with the View/Change Booking");
		System.out.println("ANS.\n.Retrieve itinerary\r\n"
				+ ".Re-Print itineraryy\r\n"
				+ ".Email itinerary\r\n"
				+ ".Add meals and baggage\r\n"
				+ ".Add seat\r\n"
				+ ".Split PNR\r\n"
				+ ".Cancel and request refund for your itinerary");
		System.out.println("\n**************************************************************************************************");

		System.out.println("3.What are the rescheduling charges?");
		System.out.println("ANS.The rescheduling charge for a domestic flight is INR 200 per person per ");
		System.out.println("\n**************************************************************************************************");

		System.out.println("4.What are the cancellation charges?");
		System.out.println("ANS.The cancellation charges include a fee of INR 500 for domestic flights ");
		System.out.println("\n**************************************************************************************************");

		System.out.println("1.MAIN MENU.\n2.EXIT.");
	    System.out.print("ENTER HERE : ");

		int deci = sc.nextInt();
		if(deci==1)
		{
			new leader().GetDetails();
		}
		else
		{
			new end().End();
		}
		}
		else if(options==3)
		{
			System.out.println("****************************CONTACT**************************");
			System.out.println("CUSTOMAR CARE : +91 6266777983,+91 6267882934");
			System.out.println("DOCTERS HELPLINE NO : +91 6464226172");
			System.out.println("FOR ANY QUERIES MAIL US IN : satyprakashsahu548@gmail.com");
			System.out.println("1.MAIN MENU.\n2.EXIT.");
		    System.out.print("ENTER HERE : ");

			int deci = sc.nextInt();
			if(deci==1)
			{
				new leader().GetDetails();
			}
			else
			{
				new end().End();
			}

		}
		else if(options==4)
		{
			new leader().GetDetails();
		}
	}
	
}
