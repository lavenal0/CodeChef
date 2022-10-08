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
		    int X=obj.nextInt();
		    int Y=obj.nextInt();
		    int N=X*Y;
		    if(N>4){
		        if(N%4!=0 ){
		            N=(N/4)+1;
		            System.out.println(N);
		        }
		        else{
		            N=N/4;
		            System.out.println(N);
		        }
		    }
		    else{
		        N=1;
		        System.out.println(N);
		    }
		    
		}
	}
}
