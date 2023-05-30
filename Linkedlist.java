import java.util.*;
class Linkedlist
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void creation()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        do
        {
        System.out.println("Enter a no");
        int a=sc.nextInt();
        Node new_node=new Node(a);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
        System.out.println("If insert more data press :1");
        n=sc.nextInt();
        }
        while(n==1);
    }
    public void traverse()
    {
        Node p=head;
        if(head==null)
        {
            System.out.println("List id empty!");
        }
        else
        {
            while(p!=null)
            {
                System.out.print(p.data+"-->");
                p=p.next;
            }
        }
    }
    public void insert()
    {
        boolean a;
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n 1:for beginning insertion \n 2:for last Insertion \n 3:for specific insertion");
    
        int ch=sc.nextInt();
        System.out.println("Enter data to insert");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        switch(ch)
        {
            case 1: new_node.next=head;
                    head=new_node;
                    break;
            case 2: 
                    Node p=head;
                    while(p.next!=null)
                    {
                        p=p.next;
                    }
                    p.next=new_node;
                    break;
            case 3: System.out.println("enter position :");
                    int pos=sc.nextInt();
                    Node p1=head;
                    while(pos!=2)
                    {
                        pos--;
                        p1=p1.next;
                    }
                    new_node.next=p1.next;
                    p1.next=new_node;
        }
        System.out.println("want to insert more data:");
        a=sc.nextBoolean();
        }
        while(a);
    }
    // public void delete()
    // {
    //     Scanner sc=new Scanner(System.in);
    //     do
    //     {
    //         if(head==null)
    //         {
    //             System.out.println("list is empty");
    //         }
    //         System.out.println("\n 1:from 1st position \n 2:last pos \n3:specific pos");
    //         int pos=sc.nextInt();
    //         switch(pos)
    //         {
    //             case 1:head=head.next;
    //                    break;
    //             case 2:Node p=head;
    //                    while(p.next!=null)
    //                    {
    //                     p=p.next;
    //                    } 
    //                    p.next=null;
    //                    break;
    //             case 3:System.out.println("enter postion to be deleted");
    //                     int pos=sc.nextInt();
    //                     Node p1=head;
    //                     while(pos!=2)
    //                     {
    //                         pos--;
    //                         p1=p1.next;
    //                     }
    //                     new_node.next=p1.next;
    //                     p1.next=new_node;       
    //         }
    //     }
    //     while();
    // }
    public static void main(String[] args) 
    {
        Linkedlist list=new Linkedlist();
        list.creation();
        list.traverse();
        list.insert();  
        list.traverse();  
    }
}