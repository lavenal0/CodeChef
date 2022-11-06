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
		    int N=1;
		    int sum=0;
		    int Z=X+Y;
		    while(Z!=0){
		        if(Z%10==0){
		            N=Z%10;
		            N=6;
		            Z=Z/10;
		        }
		        else if(Z%10==1){
		            N=Z%10;
		            N=2;
		            Z=Z/10;
		        }
		        else if(Z%10==2){
		            N=Z%10;
		            N=5;
		            Z=Z/10;
		        }
		        else if(Z%10==3){
		            N=Z%10;
		            N=5;
		            Z=Z/10;
		        }
		        else if(Z%10==4){
		            N=Z%10;
		            N=4;
		            Z=Z/10;
		        }
		        else if(Z%10==5){
		            N=Z%10;
		            N=5;
		            Z=Z/10;
		        }
		        else if(Z%10==6){
		            N=Z%10;
		            N=6;
		            Z=Z/10;
		        }
		        else if(Z%10==7){
		            N=Z%10;
		            N=3;
		            Z=Z/10;
		        }
		        else if(Z%10==8){
		            N=Z%10;
		            N=7;
		            Z=Z/10;
		        }
		        else if(Z%10==9){
		            N=Z%10;
		            N=6;
		            Z=Z/10;
		        }
		        sum+=N;
		    }
		    System.out.println(sum);
		}
	}
}
