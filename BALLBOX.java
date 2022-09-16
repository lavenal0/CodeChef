/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
{
		int N,K,T,var;
		Scanner obj= new Scanner(System.in);
		T=obj.nextInt();
		while(T!=0){
		    N=obj.nextInt();
		    K=obj.nextInt();
		    if(N>=K ){
		            if(K%2==0){
						var=K/2;
						var=(var*K)+var;
						if(N>=var){
							System.out.println("YES");
						}
						else{
							System.out.println("NO");
						}
					}
					else{
						var=(K+1)/2;
						var=var*K;
						if(N>=var){
							System.out.println("YES");
						}
						else{
							System.out.println("NO");
						}
					} 
		    }
		    else{
		        System.out.println("NO");
		    }		    
		    T--;
		}
	}
}
