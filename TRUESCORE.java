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
		    int X1=obj.nextInt();
		    int Y1=obj.nextInt();
		    if(X<=X1 && Y<=Y1){
		        System.out.println("POSSIBLE");
		    }else{
		        System.out.println("IMPOSSIBLE");
		    }
		}
		
	}
}
