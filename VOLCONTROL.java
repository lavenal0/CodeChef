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
		int X,Y,T;
		Scanner obj=new Scanner(System.in);
		T=obj.nextInt();
		for(int i=1;i<=T;i++){
		    X=obj.nextInt();
		    Y=obj.nextInt();
		    if(X>Y){
		        X=X-Y;
		        System.out.println(X);
		    }
		    else{
		        Y=Y-X;
		        System.out.println(Y);
		    }
		    }
		    
		}
	}

