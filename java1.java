import java.io.*;
import java.util.*;
class Java1
{
    public static void main(String args[])throws IOException
    {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("enter name");
        String n=io.readLine();
        System.out.println("Enter age");
        int age=Integer.parseInt(io.readLine());
        System.out.println("enter section");
        char sec=(char)io.read();
        // System.out.println("enter percentage marks");
        // float percentage=Float.parseFloat(io.readLine());
        // // double percentage=Double.parseDouble(io.readLine());
        System.out.println(n);
        System.out.println(sec);
        System.out.println(age);
        // System.out.println(percentage);
    }
}