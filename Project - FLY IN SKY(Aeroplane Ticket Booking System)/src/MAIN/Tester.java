package MAIN;

import java.util.Scanner;

public class Tester extends Thread implements Password {
	  Scanner sc = new Scanner(System.in);
	 static int Attempts = 3;
	public  boolean USERID()
	{
		String ID;
		if(Attempts!=0)
		{
        try {
        	
		     System.out.print("enter ID : ");		
	         ID = sc.nextLine();
		
		        if(ID.equalsIgnoreCase(Password.getID())==false)
		        {
		     	System.out.println("Invalid ID");
		     	System.out.println(--Attempts +" : Attempts are left");
			    return USERID();
		        }		
             }
        catch(Exception e)
        {
        	System.out.println("Invalid Input : "+e.getMessage());
        	return USERID();
        }
		}
		else {
			blocked();
			return false;
		}
        
        return true;
		
	}
	
	public boolean USERPASS()
	{
		String Pass;
		
		if(Attempts!=0)
		{
		try {
             System.out.print("enter pass : ");
		
		     Pass = sc.nextLine();
		     if(Pass.equalsIgnoreCase(Password.getPass())==false)
		     {
			  System.out.println("Invalid Password");
			  System.out.println(--Attempts +" : Attempts are left");
			  return USERPASS();
		     }
		   }
		catch(Exception e)
		{
			System.out.println("Invalid input : "+e.getMessage());
			return USERPASS();
		}
		}
		else {
			blocked();
			return false;
		}
		
		return true;
	}
	
	public static boolean CheckValid()
	{
		if( new Tester().USERID() &&  new Tester().USERPASS())
		{
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void run()
	{
		System.out.println("WELCOME SIR/MADAM PLEASE ENTER YOUR ID AND PASSWORD");
		if(CheckValid())
		{
			try {
				new leader().GetDetails();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		else {
			try {
				Thread.currentThread().sleep(15000);
				Attempts = 3;
				run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
	public static void blocked()
	{
		System.out.println("******************   Try Again After 15 Secconds.....  :(  ***********");
		System.out.println("**********************************************************************");
	}
	

	public static void main(String[] args)  {
		
		Thread t1 = new Thread(new Tester());		
	    t1.start();
		
		
		

	}
}
