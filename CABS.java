// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.io.*;

class CABS{
    public static void main(String[] args) throws Exception{
        int X;
        double Y;
        Scanner obj=new Scanner(System.in);
        X=obj.nextInt();
        Y=obj.nextInt();
        if(X%5==0 && X<=Y){
            Y=(Y-X)-0.50;
            System.out.println(Y);
        }
        else{
            System.out.println(Y);
        }
    }
}

