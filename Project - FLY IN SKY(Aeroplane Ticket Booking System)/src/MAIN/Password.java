package MAIN;

interface protect{
	String ID = "satya";
	String pass = "satya@123";	
}
public interface Password extends protect {

	 static String getID()
	{
		return ID;
	}	
	 static String getPass()
	{
		return pass;
	}
	
}
