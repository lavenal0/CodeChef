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
		int T,T1,T2,R1,R2;
		Scanner sc= new Scanner(System.in);
		
		T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    
		T1=sc.nextInt();
		T2=sc.nextInt();
		R1=sc.nextInt();
		R2=sc.nextInt();
		
		double Time=(double)(Math.pow(T1,2)/Math.pow(R1,3));
		double Axes=(double)(Math.pow(T2,2)/Math.pow(R2,3));
		
		if(Time==Axes){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		
		}

	}
}
