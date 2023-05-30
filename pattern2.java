// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
class Pattern1 {
    public static void main(String args[])throws IOException {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("required pattern:-");
        int sp=0;
        for(int i=5;i>=1;i--)
        {
            for(int k=1;k<=sp;k++)
            {
               System.out.print(" ");
         
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
        
            }
            sp++;
            System.out.println();
        }
        System.out.println("Thank for learning!");
    }
}