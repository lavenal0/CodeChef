/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int T,R1,R2,R3,R4;
		T=obj.nextInt();
		for(int i=1;i<=T;i++){
		    R1=obj.nextInt();
		    R2=obj.nextInt();
		    R3=obj.nextInt();
		    R4=obj.nextInt();
		    if(R1==R2 && R2==R3 && R3==R4 && R1!=1){
		        System.out.println("IN");
		    }else{
		        System.out.println("OUT");
		    }
		}
	}
}
