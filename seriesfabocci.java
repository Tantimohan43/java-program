// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
class HelloWorld {
    public static void main(String[] args)throws IOException {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("required series:-");
        int a=0,b=1;
        for(int i=1;i<=20;i++)
        {
        if(i==1)
        System.out.print(a+","); 
        else if(i==2)
        System.out.print(b+","); 
        else
        {
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        }
        System.out.println("Thank for learning!");
    }
}