 
  
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t>=1 && t<=100)
	    {
	     long n = sc.nextInt();
	      if(n>=1 && n<=(Math.pow(10, 9)))
	      {
            	     if(n==1)
            	     {
            	         System.out.println("0");
            	     }else if(n%2 == 1)
            	     {
            	         System.out.println(  ((n/2)+1)*(n/2)*2   );
            	     }else 
            	     {
            	         System.out.println( (n/2)*(n/2)*2 );
            	     }
	      } 
	     
	        t--;
	    }
	}
}



