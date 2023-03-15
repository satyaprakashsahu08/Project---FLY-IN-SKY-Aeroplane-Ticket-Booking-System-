package MAIN;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill {
Scanner sc = new Scanner(System.in);
	public void bill() throws Exception
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("*******************************************BOARDING PASS*******************************************************");
		System.out.println("***************************************************************************************************************");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd                                                                                             HH:mm:ss");
		LocalDateTime now = LocalDateTime.now(); 
		System.out.println(dtf.format(now));
		
		System.out.println("*******************************************"+price.seatclass+"*******************************************************");

		
		System.out.println("PASSENGERS    : "+price.get);
		
		
		System.out.println("FROM          : "+Ticket_Booking.from2);
		
		System.out.println("TO            : "+Ticket_Booking.to);
	
		System.out.println("BOARDING DATE : "+price.date);
		
		
		System.out.println("PLANE DETAILS : "+Ticket_Booking.get2);
		
		
		System.out.println("PRICE         : "+passenger.count+" X "+price.fakeTotal);
		
		
		System.out.println("GST           : "+price.FakeGST+"%");
		
		
		System.out.println("TOTAL         : " +price.Total+"rs.");
		System.out.println("****************************************************************************************************************");

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		
		new takeBiilToFile().operation4();
	}
	

}

class takeBiilToFile{
	public void operation4() throws Exception
	{
		try {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd                                                                                             HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Writing Data to a File........ ");

		FileOutputStream fos = new FileOutputStream("D:\\Test Paper\\ticket.txt");
        
        String date = "*******************************************BOARDING PASS*******************************************************\n"
        		+ "***************************************************************************************************************\n"+dtf.format(now)+"\n*******************************************"+price.seatclass+"*******************************************************\n"+"PASSENGERS    : "+price.get+"\n"
        		+"FROM          : "+Ticket_Booking.from2+"\n"+"TO            : "+Ticket_Booking.to+"\n"+"BOARDING DATE : "+price.date+"\n"+"PLANE DETAILS : "+Ticket_Booking.get2+"\n"+
        		"PRICE         : "+passenger.count+" X "+price.fakeTotal+"\n"+"GST           : "+price.FakeGST+"%"+"\n"+"TOTAL         : " +price.Total+"rs."+"\n"+"****************************************************************************************************************";
       
        byte arr[] = date.getBytes();
        
        fos.write(arr);
        
        System.out.println("Data Enterd : PLEASE PRINT YOUR TICKET");
        fos.close();

		}
		catch(Exception e)
		{
			System.out.println("File not found : "+e.getMessage());
		}
	}
}
