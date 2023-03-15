package MAIN;
import java.util.Scanner;
public class end {
    Scanner sc = new Scanner(System.in);
	public int End() throws Exception
	{
	
		System.out.println("DO YOU REALY WANT TO EXIT -  ");
		System.out.println("FOR CONTINUE SELECT [NO] FOR EXIT[YES]");
		String decision = sc.nextLine();
		if(decision.equalsIgnoreCase("yes")==true)
		{
			System.out.println("***************************THANK YOU FOR VISITING HERE**************************");
			System.out.println("********************************| COME AGAIN |**********************************");
		}
		else if(decision.equalsIgnoreCase("no")==true)
		{
			new leader().GetDetails();
		}
		else
		{
			System.out.println("INVALID INPUT! CHECK AGAIN");
			return End();
		}
		return 1;
	}
	
}
