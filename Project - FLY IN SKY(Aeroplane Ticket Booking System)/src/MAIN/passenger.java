package MAIN;
import java.util.Scanner;
public class passenger {
	static int i=0;
	static int id=0;
	static int i2=0;
	static int id2=0;
	static int i3=0;
	static int id3=0;
	static int count = 0;

Scanner sc = new Scanner(System.in);
static {
	System.out.println("NOTE :- *DON'T BUY TICKET FOR LESS THEN 4 YEAR KID*");
}
	public String[] luxi()
	{
		System.out.println("ENTER NUMBER OF PASSENGER *[LIMIT-4]: ");
		int size = sc.nextInt();
		if(size<=0 || size>4)
		{
			System.out.println("INVALID INPUT");
			 return luxi();
		}
		String [] Passenger = new String[size];

		
		int [] LUX = new int[] {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010};
		int ps=1;
		size+=id;
		
		for(;i<size;i++,id++)
		{
		System.out.println("ENTER "+ps+" PASSENEGR DETAILS");
		sc.nextLine();
		String name = name();
		int age = age();
        
		
		char gender = gen();

		String all_details =ps+"."+ name+"    "+age+"   "+gender+"  "+LUX[i];
		
		Passenger[i] = all_details;
		count++;
		ps++;

		}
		
		
	
	return Passenger;
	}
	
	
public String[] Bussi()
    {
		
		System.out.println("ENTER NUMBER OF PASSENGER *[LIMIT-4]: ");
		int size = sc.nextInt();
		if(size<=0 || size>4)
		{
			System.out.println("INVALID INPUT");
			 return Bussi();
		}
		String [] Passenger = new String[size];
		
        int [] BUS = new int[] {1011,1012,1013,1014,1015,1016,1017,1018,1019,1020,1021,1022,1023,1024,1025,1026,1027,1028,1029,1030};
		int ps=1;

		size+=id2;
		for(;i2<size;i2++,id2++)
		{
		System.out.println("ENTER "+ps+" PASSENEGR DETAILS");
		sc.nextLine();
		String name = name();

		int age = age();
		    
        
		
		char gender = gen();

		String all_details =ps+"."+ name+"    "+age+"   "+gender+"  "+BUS[i2];
		
		Passenger[i2] = all_details;
		count++;
		ps++;
		}
		
		
	return Passenger;
    }
	
	

	
public String[] econo()
{
	
	System.out.println("ENTER NUMBER OF PASSENGER *[LIMIT-4]: ");
	int size = sc.nextInt();
	if(size<=0 || size>4)
	{
		System.out.println("INVALID INPUT");
		 return econo();
	}
	String [] Passenger = new String[size];
	
    int [] ECO = new int[] {1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080 };
	int ps=1;

	size+=id3;

	for(;i3<size;i3++,id3++)
	{
	System.out.println("ENTER "+ps+" PASSENEGR DETAILS");
	sc.nextLine();
	
	String name = name();
	
	int age = age();
	
	
	
    
	char gender = gen();
	String all_details =ps+"."+ name+"    "+age+"   "+gender+"  "+ECO[i3];
	
	Passenger[i3] = all_details;
	count++;
	ps++;
	}
	
   return Passenger;
  }
public String name()
{
	try {
    System.out.println("ENTER YOUR NAME : ");	
	String name = sc.nextLine();
	int [] number = new int[] {0,1,2,3,4,5,6,7,8,9};
	String [] chara = new String[] {"!","@","#","$","&","%","^","*","~","+"};
	for(int i=0;i<number.length;i++)
	{
		if(name.contains(Integer.toString(number[i])) || name.contains(chara[i]) )
		{
			System.out.println("INVALID INPUT! CHECK AGAIN");
			return name();
		}
		
	}
	return name;
	}
	catch(Exception e)
	{
		System.out.println("Input Mismatch : "+e.getMessage());
		return name();
	}
	
}

public int age()
{
	try {
		
	
	System.out.println("ENTER YOUR AGE : ");
    int age = sc.nextInt();
    if(age<=4 || age>100)
    {
    	System.out.println("INVALID INPUT ! CHECK AGAIN");
    	return age();
    }
    return age;
	}
	catch(Exception e)
	{
		System.out.println("Input Mismatch : "+e.getMessage());
		return age();
	}
}

public char gen()
{
	try
	{
	 System.out.println("ENTER YOUR GENDER [M/F]: ");
		char gender = sc.next().charAt(0);
		if(gender=='f' || gender=='F' || gender=='M' ||gender=='m')
		{
			return gender;
	    	
		}
		System.out.println("INVALID INPUT ! CHECK AGAIN");
        return gen();
	}
	catch(Exception e)
	{
		System.out.println("input Mismatch : "+e.getMessage());
		return gen();
	}
}
}
