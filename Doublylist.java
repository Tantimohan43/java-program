import java.util.*;
class Doublylist
{
    static class Node
    {
        Node prev;
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    public void creation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter data");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
           new_node.next=head; 
           head.prev=new_node;
           head=new_node;
        }

    }
    // public void deletion()
    // {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter position:");
    //     int pos=sc.nextInt();
    //     if(head==null)
    //     {
    //         System.out.println("lsit is empty");
    //     }
    //     else
    //     {
    //        if(pos==1)
    //        {
    //         head=head.next;
    //        }
    //     }

    // }
    public void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("items are");
            Node temp=head;
           while(temp!=null)
           {
            System.out.println("-->"+temp.data);
            temp=temp.next;
           }
        }
    }
    public static void main(String[] args) 
    {
        Doublylist dd=new Doublylist();
        Scanner sc=new Scanner(System.in);

        int c;
        do
        {
            System.out.println("1:insert\n 2:delete \n 3:display");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:dd.creation();
                        break;
                case 3:dd.display();
                        break;
                default :System.out.println("match not found");
            }
            System.out.println("countinue opertion press:1");
            c=sc.nextInt();
        }
        while(c==1);
    }
}