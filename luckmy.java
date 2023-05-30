
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class luckmy
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);	
		// your code goes here
		for(int i=1;i<=4;i++)
        {
        System.out.println("enter");
        int a=sc.nextInt();
        int c=0;
        while (a>0)
        {
            int f=a%10;
            a=a/10;
            if(f==4)
            c++;
        }
        System.out.println(c);
        }
	}
}
