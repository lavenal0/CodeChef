/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj = new Scanner(System.in);
		double a,b;
		char c;
		a=obj.nextDouble();
		b=obj.nextDouble();
		c=obj.next().charAt(0);
		if(c=='+')
            System.out.println(a+b);
        if(c=='-')
            System.out.println(a-b);
        if(c=='*')
            System.out.println(a*b);
        if(c=='/')
            System.out.println(a/b);
		
	}
}
