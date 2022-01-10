public class throwAndThrows
{    
 public static void main(String[] args) throws Exception 
 {
    AgeValidation agevalidate=new AgeValidation();
    try {
    agevalidate.ageValidator(15);
    }
    catch(Exception e)
    {
   	 System.out.println(e);
   	 System.out.println("this is end of the program");
    }
    
    
    
 }
}

 class AgeValidation {
    
    public void ageValidator(int age)throws Exception {
   	 
   	 if(age>=18) {
   		 System.out.println("right to vote");
   	 }
   	 else {
   		 //raise an exception obj
   		 throw new InvalidAgeException("check the age");
   	 }
   	 
    }
    
    

}

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String comment)
	{
		super(comment);
	}
}







