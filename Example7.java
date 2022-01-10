import java.util.Scanner;
public class Example7 
{
  public static void main(String[] args) 
  {
	System.out.println("Enter Your String");
	Scanner sc = new Scanner(System.in);
	String str;
    String str2=" ";
	str = sc.nextLine();
	for(int i=0;i<str.length();i++)
	{
		char w = str.charAt(i);
		char m="w";
		System.out.print(ord(m)+" ");
	}
	
  }
}
