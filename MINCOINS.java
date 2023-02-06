/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner obj=new Scanner(System.in);
		
		int T=obj.nextInt();
		while(T-->0){
		    int X=obj.nextInt();
		    int Count=0;
		    while(X!=0){
		        if(X%10==0){
		            X=X-10;
		            Count++;
		        }else if(X%5==0){
		            X=X-5;
		            Count++;
		        }else{
		            X=0;
		            Count=-1;
		        }
		    }
		    System.out.println(Count);
		}
	}
}
