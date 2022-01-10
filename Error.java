package QueuingDS;
import java.util.*;
class Errorcreating extends Exception
     {
    	public String toString()
    		{
    		      return "Input Mismatch Exception";
    	    }
     }
public class queue 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter How Many Number You Want To Enter");
        //System.out.println();
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		int a[] = new int[b];
		int j;
		for(j=0;j<b;j++)
		{
			a[j] = scanner.nextInt();
		}
		Errorcreating V1 = new Errorcreating();
		try
		{
			System.out.println("Enter What Number You Want To Print");
			int g = scanner.nextInt();
			for(int k=0;k<b;k++)
			{
				if(a[k]==g)
				{
					System.out.println("Your Number Are In The Position ----->>>>>>"+(k+1));
				    
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println(V1.toString());
		}
	}
	
}
