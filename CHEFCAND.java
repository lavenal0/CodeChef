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
		    int Y=obj.nextInt();
		    if(X<=Y){
		        System.out.println("0");
		    }else if(X>Y){
		        int Z=X-Y;
		        if(Z%4==0){
		            System.out.println(Z/4);
		        }else{
		            System.out.println((Z/4)+1);
		        }
		    }
		}
	}
}
