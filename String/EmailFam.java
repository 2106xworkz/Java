
public class EmailFam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "abc@Yahoo.com";
		
		if(S.endsWith("Yahoo.com")&& S.contains("@"))
		{
	     System.out.println("A Valid email of Yahoo fam!!");
		  }
			else if(S.endsWith("outlook.com")&& S.contains("@"))
		  	{
		     System.out.println("A Valid email of outlook fam!!");
			  }
				else if(S.endsWith("Hotmail.com")&& S.contains("@"))
				{
			     System.out.println("A Valid email of Hotmail fam!!");
				  }
					else{
						  System.out.println("Invalid email");
					  }	
	}

}
