/* package codechef; // don't place package name! */
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj=new Scanner(System.in);
		int T=obj.nextInt();
		for(int i=0;i<T;i++){
		    int X=obj.nextInt();
		    int Y=obj.nextInt();
		    if(Y%X==0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
		
	}
}
