/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj=new Scanner(System.in);
		int T,X,Y,Z;
		T=obj.nextInt();
		
		while(T!=0){
		    X=obj.nextInt();
	    	Y=obj.nextInt();
    		Z=obj.nextInt();
		    X=2*(X+180);
		    Z=Y+Z;
		    X=X-Z;
		    System.out.println(X);
		    
		    X=0;
		    Y=0;
		    Z=0;
		    T--;
		}
	}
}
