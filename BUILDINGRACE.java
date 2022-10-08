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
		int T=obj.nextInt();
		while(T-->0){
		    float X=obj.nextFloat();
		    float Y=obj.nextFloat();
		    float X1=obj.nextFloat();
		    float Y1=obj.nextFloat();
		    if(X/X1<Y/Y1){
		        System.out.println("Chef");
		    }
		    else if(X/X1>Y/Y1){
		        System.out.println("Chefina");
		    }
		    else{
		        System.out.println("Both");
		    }
		}
	}
}
