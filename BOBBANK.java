/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int W,X,Y,Z,T;
		Scanner obj=new Scanner(System.in);
		T=obj.nextInt();
		while(T!=0){
		    W=obj.nextInt();
		    X=obj.nextInt();
		    Y=obj.nextInt();
		    Z=obj.nextInt();
		    
		    X=X*Z;
		    Y=Y*Z;
		    W=W+X-Y;
		    System.out.println(W);
		    T--;
		}
	}
}
