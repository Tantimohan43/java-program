// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
class Series2{
    public static void main(String[] args)throws IOException {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("required series:-");
        int a=20;
        for(int i=1;i<=10;i++)
        {
            
        System.out.print(i+",");
        System.out.print(a+","); 
        a=a-2;
        }
        System.out.println("Thank for learning!");
    }
}