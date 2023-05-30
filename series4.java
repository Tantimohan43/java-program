// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
class Series4 {
    public static void main(String[] args)throws IOException {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("required series:-");
        double a=0;
        for(int i=1;i<=10;i++)
        {
            a=(double)1/i;
        System.out.print(a+","); 
        }
        System.out.println("Thank for learning!");
    }
}