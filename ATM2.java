/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,i,t;
		Scanner obj= new Scanner(System.in);
        t=obj.nextInt();
        while(t!=0){
		x=obj.nextInt();
		y=obj.nextInt();
		int arr[]= new int[x];
		for(i=0;i<x;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<x;i++){
            if(y>=arr[i]){
                y=y-arr[i];
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }  
            
		}
		System.out.println();
        t--;
    }
	}
}
