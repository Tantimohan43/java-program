// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class affine {
     public static void main(String args[]) {
         char p[]={'M','O','H','A','N'};
         char k[]={'A','B','C'};
         int i=0,j=0;
         int a=p.length;
         int b=k.length;
         while(i!=a && j!=b)
         {
             int e=65+((int)p[i]+(int)k[j])%26;
             System.out.println((char)e);
             if(j==b-1)
             {
                j=0;
                i++;
             }
             else
             {
                 i++;
                 j++;
             }
             
         }
     System.out.println("Hello, World!");
    }
}