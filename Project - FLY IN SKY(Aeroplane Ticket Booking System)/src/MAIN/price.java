package MAIN;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class price {
Scanner sc = new Scanner(System.in);
static int LC = 10;
static int BC = 20;
static int EC = 50;
static String get = "";
static float Total=0;
static float fakeTotal = 0;
static int FakeGST = 0;
static String date="";
static String seatclass = "";
	public void Price(int num) throws Exception
	{
		
		
		System.out.println("WE ARE HAVING 3 DIFFERANT CLASSES : ");
		System.out.println("1.LUXURY CLASS. \n2.BUSINESS CLASS. \n3.ECONOMY CLASS. \n4.MAIN MENU. \n5.EXIT.");
		System.out.print("Enter Here : ");
		int clases = sc.nextInt();
		
		sc.nextLine();

		if(clases==1)
		{
			
			System.out.println("***********************THIS IS LUXURY CLASS*************************");
			date = date();
			seatclass = "LUXURY CLASS";
			System.out.println("TOTAL SEATS AVAILABLE : "+LC);
			System.out.println("SO,IF YOU WANTS TO BUY A TICKET PRESS 1 FOR EXIT PRESS 2");
			int deci = sc.nextInt();
			if(deci==1)
				{
				String [] pass_details = new passenger().luxi();//for taking passenger details
				String get_det = Arrays.toString(pass_details);
				
				get+=get_det;
			    System.out.println("**************************************************************");
			    System.out.println("FOR : EXIT[1]/SHOW PASS DETAILS[2]/CONFIRM[3]");
			    int deci2 = sc.nextInt();
               
                
                 if(deci2==1)
                {
                	 end2();
                }
                else if(deci2==2)
                {
    		    System.out.println("PASSENGERS DETAILS");
    		    System.out.println(get);
    		    fakeTotal = 3000;
    		    FakeGST = 12;

				
				Total = ((passenger.count*3000)+(((passenger.count*3000)*12)/100));
    		    System.out.println("FOR EXIT[1]/CONFIRM[2]");
    		    int deci3  = sc.nextInt();
    		    if(deci3==1)
    		    {
    		    	end2();
    		    }
    		    else if(deci3==2)
    		    {
    		    	new Bill().bill();
    		    }
                }
                else if(deci2==3)
                {
                	 
					Total = ((passenger.count*3000)+(((passenger.count*3000)*12)/100));
         		    fakeTotal = 3000;
         		    FakeGST = 12;
                	new Bill().bill();
                }
				}
			else 
			{
				end2();
			}

		}
		else if(clases==2)
		{
			System.out.println("***********************THIS IS BUSINESS CLASS*************************");
			seatclass = "BUSINESS CLASS";
			date = date();
			System.out.println("TOTAL SEATS AVAILABLE : "+BC);
			System.out.println("SO,IF YOU WANTS TO BUY A TICKET PRESS 1 FOR EXIT PRESS 2");
			int deci = sc.nextInt();
			if(deci==1)
				{
				
				String [] pass_details = new passenger().Bussi();//for taking passenger details
				String get_det = Arrays.toString(pass_details);
				
				get+=get_det;

			    System.out.println("**************************************************************");
			    System.out.println("FOR : EXIT[1]/PASS DETAILS[2]/CONFIRM[3]");
			    int deci2 = sc.nextInt();
			    
               
                
                if(deci2==1)
                {
                	end2();
                }
                else if(deci2==2)
                {
                	System.out.println("PASSENGERS DETAILS");
        		    System.out.println(get);
        		   
					Total = ((passenger.count*2500)+(((passenger.count*2500)*8)/100));
        		    fakeTotal = 2500;
        		    FakeGST = 8;

        		    System.out.println("FOR EXIT[1]/CONFIRM[2]");
        		    int deci3  = sc.nextInt();
        		    if(deci3==1)
        		    {
        		    	end2();
        		    }
        		    else if(deci3==2)
        		    {
        		    	new Bill().bill();
        		    }
                    
                }
                else if(deci2==3)
                {
                	 
					Total = ((passenger.count*2500)+(((passenger.count*2500)*8)/100));
         		    fakeTotal = 2500;
         		    FakeGST = 8;
                	new Bill().bill();
                	
                }
				}
			else 
			{
				end2();			}
			
		}
		else if(clases==3)
		{
			System.out.println("***********************THIS IS ECONOMY CLASS*************************");
			seatclass = "ECONOMY CLASS";
			date = date();
			System.out.println("TOTAL SEATS AVAILABLE : "+EC);
			System.out.println("SO,IF YOU WANTS TO BUY A TICKET PRESS 1 FOR EXIT PRESS 2");
			int deci = sc.nextInt();
			if(deci==1)
				{
				String [] pass_details = new passenger().econo();//for taking passenger details
				String get_det = Arrays.toString(pass_details);
				
				get+=get_det;			   
				System.out.println("**************************************************************");
			    System.out.println(" FOR : EXIT[1]/PASS DETAILS[2]/CONFIRM[3]");
			    int deci2 = sc.nextInt();
                
               
                 if(deci2==1)
                {
                	 end2();
                }
                else if(deci2==2)
                {
                	System.out.println("PASSENGERS DETAILS");
        		    System.out.println(get);
        		    
					Total = ((passenger.count*2000)+(((passenger.count*2000)*5)/100));
        		    fakeTotal = 2000;
        		    FakeGST = 5;

        		    System.out.println("FOR EXIT[1]/CONFIRM[2]");
        		    int deci3  = sc.nextInt();
        		    if(deci3==1)
        		    {
        		    	end2();
        		    }
        		    else if(deci3==2)
        		    {
        		    	new Bill().bill();
        		    }
                }
                else if(deci2==3)
                {
                	
					Total = ((passenger.count*2000)+(((passenger.count*2000)*5)/100));
         		    fakeTotal = 2000;
         		    FakeGST = 5;
                	new Bill().bill();
                }
				}
			else 
			{
				end2();
			}
		}
		else if(clases==4)
		{
			new leader().GetDetails();
		}
		else if(clases==5)
		{
			new end().End();
		}
		else
		{
			System.out.println("INVALID INPUT ! CAHECK AGAIN");
			Price(0);
		}
	}
	public void end2()
	{
		System.out.println("***************************THANK YOU FOR VISITING HERE**************************");
		System.out.println("********************************| COME AGAIN |**********************************");
	}
	public String date()
	{
		String string = MY1();      
	      
	      LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
	      return date.toString();
	}
	
	public String MY1()
	{
		boolean isDate = false;
        String date = DateERROR();
	    String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";
	    isDate = date.matches(datePattern);
	    if(isDate ) 
	    {
		
	    	 return date;
	    }
	    else {
		     System.out.println("INVALID INPUT ! CHECK AGAIN");
		}
	    
	    return MY1();
	   
        
	}
	public String DateERROR()
	
	{
		System.out.println("ENTER TREVELLING DATE *[YYYY-MM-DD] : ");

		String date = sc.nextLine();
		String year="";
		String mm="";
		String day="";
		try {
		year = date.substring(0, 4);

		mm = date.substring(5, 7);
		
	    day = date.substring(8);
		
		}
		catch(Exception e)
		{
			System.out.println("Invalid Valid ! "+e.getMessage());
			return DateERROR();
		}

        int number1 = Integer.parseInt(year);
        int number2 = Integer.parseInt(mm);
        int number3 = Integer.parseInt(day);
        
        LocalDate Cdate = LocalDate.now();
        String Date = Cdate.toString();        
	      String Cyear = Date.substring(0, 4);

			String Cmm = Date.substring(5, 7);
			
			String Cday = Date.substring(8);

	        int Cnumber1 = Integer.parseInt(Cyear);
	        int Cnumber2 = Integer.parseInt(Cmm);
	        int Cnumber3 = Integer.parseInt(Cday);



		 if(number1<Cnumber1 || number1>Cnumber1 || number2<Cnumber2 ||number2>12|| number3>31 )
         {
	     System.out.println("INVALID INPUT ! CHECK AGAIN");
	     return DateERROR();
         }
		 else if(Cnumber2==number2 && Cnumber3>number3)
		 {
			 System.out.println("INVALID INPUT ! CHECK AGAIN");
		     return DateERROR();
			 
		 }
		
         return date;
	 }
        
	  
}

