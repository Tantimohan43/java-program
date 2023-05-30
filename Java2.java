import java.io.*;
class Java2 {
    public static void main(String[] args)throws IOException {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("Enter a no:");
        int m=Integer.parseInt(io.readLine());
        System.out.println("Multiplication of"+m+":-");
        for(int i=1;i<=10;i++)
        {
        System.out.println(m+"*"+i+"="+(i*m));  
        }
        System.out.println("Thank for learning!");
    }
}