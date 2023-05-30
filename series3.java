// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
class Series3 {
    public static void main(String[] args)throws IOException {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("required series:-");
        int a=5;
        for(int i=1;i<=8;i++)
        {
        a=a*10+5;    
        // System.out.print(i+",");
        System.out.print(a+","); 
        
        }
        System.out.println("Thank for learning!");
    }
}