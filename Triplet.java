class Triplet
{
    public static void main(String args[])
    {
        int a[]={1,2,3};
        int b[]={2,3,4};
        int c[]={3,4,5};
        int A=a.length;
        int B=b.length;
        int C=c.length;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        int i=0,j=0,k=0,count=0;
        while(i!=A && j!=B && k!=C)
        {
            System.out.println("apple");
            if(a[i]<b[j] && b[j]<c[k])
            count++;
            else if(b[j]>c[k])
            k=k++ % 3;
            else if(b[j]<a[i])
            j=j++%3;
            else
            i=i++;
        }
        System.out.println(count);
    }
}