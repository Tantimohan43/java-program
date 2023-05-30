import java.util.*;
class Queuearr
{
    int f=-1;
    int r=-1;
    int size=10;
    int q[]=new int[size];
    public void enq()
    {
       
       Scanner sc=new Scanner(System.in);
       if(r==size-1)
       {
        System.out.println("queue id full");

       }
       else
       {
            System.out.println("enter no");
            int data=sc.nextInt();
            if(f==-1 && r==-1)
            {
                r=r+1;
                f=f+1;
                q[r]=data;
            } 
            else 
            {
                r=r+1;
                q[r]=data;
            }
       }
    }
    public void deq()
    {
        if(f==-1)
        {
            System.out.println("empty queue");
        }
        else
        {
            System.out.println("deleted item :"+q[f]);
            f=f+1;
        }
    }
    public void display()
    {
        System.out.print("items are: \n");
        int p=f;
        while(p<=r)
        {
            System.out.println(" \n "+q[p]);
            p++;
        }
    }
    public static void main(String[] args) 
    {
    int c;
    Queuearr qarr=new Queuearr();
    Scanner sc = new Scanner(System.in);
    do
      {
        System.out.println("\n 1:for enqueue \n 2:for dequeue \n 3:display");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:qarr.enq();
                    break;
            case 2:qarr.deq();
                    break;
            case 3:qarr.display();
                    break;
            default :System.out.println("match not found");
        }
        System.out.println("do u want to still continue press 1");
        c=sc.nextInt();
      } 
      while(c==1); 
    }
}