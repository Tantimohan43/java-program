import java.util.*;
class StackImp
{
    static int a=5;
    int top=-1;
    int sk[]=new int[a];
    public void push()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data:");
        int data=sc.nextInt();
        if(top==a-1)
        {
            System.out.println("stack is Full:");
        }
        else
        {
            sk[++top]=data;
            System.out.println("item inserted");
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            top=top-1;
            System.out.println("element is deleted");
        }
    }
    public void display()
    {
        System.out.println("items are");
        for(int i=top;i>=0;i--)
        {
            System.out.println(sk[i]);
        }
    }
    public static void main(String[] args) 
    {
        int c;
      StackImp stack=new StackImp();
      Scanner sc = new Scanner(System.in);
      do
      {
        System.out.println("\n 1:for push \n 2:for pop \n 3:display");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:stack.push();
                    break;
            case 2:stack.pop();
                    break;
            case 3:stack.display();
                    break;
            default :System.out.println("match not found");
        }
        System.out.println("do u want to still continue press 1");
        c=sc.nextInt();
      } 
      while(c==1); 
    }
}