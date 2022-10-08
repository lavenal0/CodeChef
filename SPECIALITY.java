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
		    int Z=obj.nextInt();
		    if(X>Y && X>Z){
		        System.out.println("Setter");  
		    }
		    if(Y>X && Y>Z){
		        System.out.println("Tester");  
		    }
		    if(Z>X && Z>Y){
		        System.out.println("Editorialist");  
		    }
		}
	}
}
