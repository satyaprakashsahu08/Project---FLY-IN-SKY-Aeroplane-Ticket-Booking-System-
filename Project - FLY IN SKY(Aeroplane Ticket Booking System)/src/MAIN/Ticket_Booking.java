package MAIN;

import java.util.Scanner;

public class Ticket_Booking 
{
Scanner sc = new Scanner(System.in);
String [] hyd = new String[]{"01:56   JAI MATA DII\t MU5984\t\t HYDERABAD\t DELHI\t\t 12 ","06:32   DOUGLAS-DC\t DC8765\t\t HYDERABAD\t CHENNAI\t 14 ","12:42   IRON-MAN\t MCU865\t\t HYDERABAD\t MUMBAI\t\t 06 ","15:30   AQUA-DC\t\t DC8765\t\t HYDERABAD\t RAIPUR\t\t 05 ","18:32   MARKONA-K\t K78965\t\t HYDERABAD\t PUNE\t\t 9 "};
String [] del = new String[]{"03:16   THOR\t\t MCU984\t\t DELHI\t\t HYDERABAD\t 01 ","05:34   FLASH-DC\t DC8365\t\t DELHI\t\t CHENNAI\t 05 ","11:42   MONGOS\t\t GU5865\t\t DELHI\t\t MUMBAI\t\t 04 ","13:30   BATMAN-DC\t BT8755\t\t DELHI\t\t RAIPUR\t\t 02 ","19:33   MAMIA-M\t\t MAM865\t\t DELHI\t\t PUNE\t\t 05 "};
String [] rai = new String[]{"00:45   JAI MATA DII\t MU5984\t\t RAIPUR\t\t DELHI\t\t 11 ","05:17   KILVAS-NS\t LS6678\t\t RAIPUR\t\t CHENNAI\t 08 ","14:32   SANGVAARI\t SAN865\t\t RAIPUR\t\t MUMBAI\t\t 01 ","16:30   HIKAN-Z\t\t 989765\t\t RAIPUR\t\t HYDERABAD\t 03 ","20:32   BEAST-K2\t K28965\t\t RAIPUR\t\t PUNE\t\t 12 "};
String [] mum = new String[]{"04:56   JAI MATA DII\t MU5984\t\t MUMBAI\t\t DELHI\t\t 07 ","11:27   PANDORA\t\t PAN765\t\t MUMBAI\t\t CHENNAI\t 11 ","15:55   TURMAK_MAKTO\t TMT865\t\t MUMBAI\t\t HYDERABAD\t 04 ","17:42   SANGVAARI\t SAN865\t\t MUMBAI\t\t RAIPUR\t\t 01 ","06:32   HYPK-K\t\t K73456\t\t MUMBAI\t\t PUNE\t\t 06 "};
String [] pun = new String[]{"02:45   MAMIA-M\t\t MAM865\t\t PUNE\t\t DELHI\t\t 07 ","07:28   HIFI-DC\t\t DC9765\t\t PUNE\t\t CHENNAI\t 14 ","12:22   AIR-8445\t 786865\t\t PUNE\t\t MUMBAI\t\t 11 ","16:22   YINK-Y2\t\t YC8765\t\t PUNE\t\t RAIPUR\t\t 05 ","09:32   MARKOVA-K\t K79965\t\t PUNE\t\t HYDERABAD\t 12 "};
String [] che = new String[]{"03:45   MAMIA-M\t\t MAM865\t\t CHENNAI\t DELHI\t\t 07 ","09:28   HIFI-DC\t\t DC9765\t\t CHENNAI\t PUNE\t\t 14 ","14:22   AIR-8445\t 786865\t\t CHENNAI\t MUMBAI\t\t 14 ","19:22   YINK-Y2\t\t YC8765\t\t CHENNAI\t RAIPUR\t\t 08 ","22:32   MARKOVA-K\t K79965\t\t CHENNAI\t HYDERABAD\t 11 "};

static String from2;
static String to;
static String get2;
/**********************************************************************************************/
    public String Boarding()
	{
		System.out.println("WE ARE OFFERING ONLY SIX PLACES TO TRAVEL LIKE - (MUMBAI\\HYDERABAD\\DELHI\\PUNE\\RAIPUR\\CHENNAI) CHOOSE YOURS");
		System.out.print("Enter Your Boarding Place : ");
		String From = sc.nextLine();
		from2 = From;
		return From;
	}
    
/************************************************************************************/
	public String Dest()
	{
		System.out.print("Enter Your Destination : ");
		String dest = sc.nextLine();
		to = dest;
		return dest.toUpperCase();
	}
	
/******************************************************************************************/
	public void mumbai(String board)
	{
		String[] mumbai = new String[]{"DELHI","CHENNAI","HYDERABAD","RAIPUR","PUNE"};

		String dest = Dest();
		
	        	int c=0;
	        	for(int i=0;i<5;i++)
	        	{
	        		if(mumbai[i].equalsIgnoreCase(dest))
	        		{
	        			for(int j=0;j<5;j++)
	        			{
	        				if((mum[j].contains(dest))==true)
	        				{
	        					System.out.println("*************************************RESULT**********************************");
	        					System.out.println(mum[j]);
	        					get2 = mum[j];
	        					System.out.println("****************************************************************************");
	        					c++;
	        				}
	        			}
	        			
	        		}
	        		
	        	}
	        	if(c==0)
	        	{
	        		System.out.println("we are not going here ! PLEASE SELECT AMONG THE DISPLAYING PLACES -");
	        		 mumbai(board);
	        	}
	       
	}
	public void pune(String board)
	{
		String[] pune = new String[]{"DELHI","CHENNAI","HYDERABAD","RAIPUR","MUMBAI"};
		String dest = Dest();
		
	        	int c=0;
	        	for(int i=0;i<5;i++)
	        	{
	        		if(pune[i].equalsIgnoreCase(dest))
	        		{
	        			for(int j=0;j<5;j++)
	        			{
	        				if((pun[j].contains(dest))==true)
	        				{
	        					System.out.println("****************************RESULT*****************************************");
	        					System.out.println(pun[j]);
	        					get2 = pun[j];

	        					System.out.println("***************************************************************************");

	        				}
	        			}
	        			c++;
	        		}
	        		
	        	}
	        	if(c==0)
	        	{
	        		System.out.println("we are not going here ! PLEASE SELECT AMONG THE DISPLAYING PLACES -");
	        		pune(board);
	        	}
	       
	}
	
	public void hyderabad(String board)
	{
		String[] hyderabad = new String[]{"DELHI","CHENNAI","MUMBAI","RAIPUR","PUNE"};
		String dest = Dest();
		
	        	int c=0;
	        	for(int i=0;i<5;i++)
	        	{
	        		if(hyderabad[i].equalsIgnoreCase(dest))
	        		{
	        			for(int j=0;j<5;j++)
	        			{
	        				if((hyd[j].contains(dest))==true)
	        				{
	        					System.out.println("****************************RESULT*****************************************");
	        					System.out.println(hyd[j]);
	        					get2 = hyd[j];

	        					System.out.println("****************************************************************************");

	        				}
	        			}
	        			c++;
	        		}
	        		
	        	}
	        	if(c==0)
	        	{
	        		System.out.println("we are not going here ! PLEASE SELECT AMONG THE DISPLAYING PLACES -");
	        		hyderabad(board);
	        	}
	       
	}

	public void delhi(String board)
	{
		String[] delhi = new String[]{"MUMBAI","CHENNAI","HYDERABAD","RAIPUR","PUNE"};
		String dest = Dest();
		
	        	int c=0;
	        	for(int i=0;i<5;i++)
	        	{
	        		if(delhi[i].equalsIgnoreCase(dest))
	        		{
	        			for(int j=0;j<5;j++)
	        			{
	        				if((del[j].contains(dest))==true)
	        				{
	        					System.out.println("****************************************RESULT*******************************");
	        					System.out.println(del[j]);
	        					get2 = del[j];

	        					System.out.println("*****************************************************************************");

	        				}
	        			}
	        			c++;
	        		}
	        		
	        	}
	        	if(c==0)
	        	{
	        		System.out.println("we are not going here ! PLEASE SELECT AMONG THE DISPLAYING PLACES -");
	        		delhi(board);
	        	}
	       
	}

	public void raipur(String board)
	{
		String[] raipur = new String[]{"DELHI","CHENNAI","HYDERABAD","MUMBAI","PUNE"};
		String dest = Dest();
		
	        	int c=0;
	        	for(int i=0;i<5;i++)
	        	{
	        		if(raipur[i].equalsIgnoreCase(dest))
	        		{
	        			for(int j=0;j<5;j++)
	        			{
	        				if((rai[j].contains(dest))==true)
	        				{
	        					System.out.println("***********************************RESULT************************************");
	        					System.out.println(rai[j]);
	        					get2 = rai[j];

	        					System.out.println("*****************************************************************************");

	        				}
	        			}
	        			c++;
	        		}
	        		
	        	}
	        	if(c==0)
	        	{
	        		System.out.println("we are not going here ! PLEASE SELECT AMONG THE DISPLAYING PLACES -");
	        		raipur(board);
	        	}
	       
	}
	
	public void chennai(String board)
	{
		String[] chennai = new String[]{"DELHI","RAIPUR","HYDERABAD","MUMBAI","PUNE"};
		String dest = Dest();
		 
	        	int c=0;
	        	for(int i=0;i<5;i++)
	        	{
	        		if(chennai[i].equalsIgnoreCase(dest))
	        		{
	        			for(int j=0;j<5;j++)
	        			{
	        				if((che[j].contains(dest))==true)
	        				{
	        					System.out.println("******************************RESULT******************************************");
	        					System.out.println(che[j]);
	        					get2 = che[j];

	        					System.out.println("*****************************************************************************");

	        				}
	        			}
	        			c++;
	        		}
	        		
	        	}
	        	if(c==0)
	        	{
	        		System.out.println("we are not going here ! PLEASE SELECT AMONG THE DISPLAYING PLACES -");
	        		chennai(board);
	        	}
	       

		
	}
/**************************************************TICKET-PRICE***********************************/	
	
/****************************************************PLANE-DETAILS
 * @throws Exception *********************************/	
	
	public void PlanesDetails() throws Exception
	
	{
		
		
		String board = Boarding();
		
		if(board.equalsIgnoreCase("HYDERABAD"))
		{
		System.out.println("*********************************WELCOME TO HYDERABAD AIRPORT******************************");
		System.out.println("-------------------------------------------------------------------------------------------");

		 System.out.println("TIME    FLIGHT NAME\t FLIGHT NUMBER   FROM\t\t DESTINATION\t GATE NO.");
		System.out.println("-------------------------------------------------------------------------------------------");

		for(int i=0;i<5;i++)
		{
			System.out.println(hyd[i]);
		}
		
		hyderabad(board);//FOR KNOWING DESTINATION
		new price().Price(0);//for price and user details
		}
		else if(board.equalsIgnoreCase("DELHI"))
		{

		System.out.println("********************************WELCOME TO DELHI AIRPORT***********************************");
		System.out.println("-------------------------------------------------------------------------------------------");


		 System.out.println("TIME    FLIGHT NAME\t FLIGHT NUMBER   FROM\t\t DESTINATION\t GATE NO.");
			System.out.println("-------------------------------------------------------------------------------------------");

		for(int i=0;i<5;i++)
		{
			System.out.println(del[i]);
		}
		delhi(board);
		new price().Price(0);
		}
		else if(board.equalsIgnoreCase("RAIPUR"))
		{

		System.out.println("*********************************WELCOME TO RAIPUR AIRPORT*********************************");
		System.out.println("-------------------------------------------------------------------------------------------");


		 System.out.println("TIME    FLIGHT NAME\t FLIGHT NUMBER   FROM\t\t DESTINATION\t GATE NO.");
			System.out.println("-------------------------------------------------------------------------------------------");

		for(int i=0;i<5;i++)
		{
			System.out.println(rai[i]);
		}
		raipur(board);
		new price().Price(0);
		}
		else if(board.equalsIgnoreCase("MUMBAI"))
		{
		System.out.println("*********************************WELCOME TO MUMBAI AIRPORT*********************************");
		System.out.println("-------------------------------------------------------------------------------------------");


		 System.out.println("TIME    FLIGHT NAME\t FLIGHT NUMBER   FROM\t\t DESTINATION\t GATE NO.");
			System.out.println("-------------------------------------------------------------------------------------------");

		for(int i=0;i<5;i++)
		{
			System.out.println(mum[i]);
		}
	    mumbai(board);
	    new price().Price(0);
		}
		else if(board.equalsIgnoreCase("PUNE"))
		{
		System.out.println("*********************************WELCOME TO PUNE AIRPORT***********************************");
		System.out.println("-------------------------------------------------------------------------------------------");


		 System.out.println("TIME    FLIGHT NAME\t FLIGHT NUMBER   FROM\t\t DESTINATION\t GATE NO.");
			System.out.println("-------------------------------------------------------------------------------------------");

		for(int i=0;i<5;i++)
		{
			System.out.println(pun[i]);
		}
		pune(board);
		new price().Price(0);
		}
		else if(board.equalsIgnoreCase("CHENNAI"))
		{
		System.out.println("*********************************WELCOME TO PUNE AIRPORT***********************************");
		System.out.println("-------------------------------------------------------------------------------------------");


		 System.out.println("TIME    FLIGHT NAME\t FLIGHT NUMBER   FROM\t\t DESTINATION\t GATE NO.");
			System.out.println("-------------------------------------------------------------------------------------------");

		for(int i=0;i<5;i++)
		{
			System.out.println(che[i]);
		}
		chennai(board);
		new price().Price(0);
		}
		else
		{
			System.out.println("INVALID INPUT ! CHEACK AGAIN");
			
			PlanesDetails();	
		}
   }
	
/*************************************************************************************/	

}
