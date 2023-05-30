import java.io.*;
class Series1{
    public static void main(String[] args)throws IOException {
        DataInputStream io=new DataInputStream(System.in);
        System.out.println("required series:-");
        for(int i=1;i<=10;i++)
        {
            int m=5*i;
            int n=7*i;
        System.out.print(m+",");
        System.out.print(n+","); 
        }
        System.out.println("Thank for learning!");
    }
}