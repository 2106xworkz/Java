public class Email {
	
 public static void main(String[]args) {
	String S = "abc@gmail.com";
	
	if(S.endsWith(".com")&& S.contains("@"))
	{
     System.out.println("A Valid email");
	  }else
	  {
		  System.out.println("Invalid email");
	  }	
}
}
