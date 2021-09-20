class Atm{
	public static void Balance(String userName ,String password ){
	String un ="abc";
	String pwd ="1234";
	String balance ="100400";
	if(pwd==password){
		System.out.println("Login Successful:");
		System.out.println(balance);
		}else {
				System.out.println("Error");
		}
	}
	public static void main(String[]args){
	System.out.println("Atm Operations");
    Atm.Balance("abc","1234");
    System.out.println("Thank you !!!");	
     
	
	}
}