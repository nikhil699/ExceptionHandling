public class Example6 
{
   public static void main(String[] args) 
   {
	 int c = args[0].length();
	 if(c==0)
	 {
		 System.out.println("No Values");
	 }
	 else
	 {
		 System.out.println("resulT is : "+c);
		 for(String i:args)
	          System.out.println(i+",");

	 }
	 
   }
}
