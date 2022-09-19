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
		for(int i=0;i<T;i++){
		    int X=obj.nextInt();
		    if(X>4 && X%4==0){
		        X/=4;
		        System.out.println(X);
		    }
		    else if(X>4 && X%4!=0){
		        X/=4;
		        System.out.println(X+1);
		    }
		    else{
		        System.out.println("1");
		    }
		}
	}
}
