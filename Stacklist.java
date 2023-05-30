import java.util.*;

class Stacklist
{
    public class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    public void push()
    {
        int m;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter data");
            int data=sc.nextInt();
            Node new_node=new Node(data);
            if(top==null)
            {
                top=new_node;
            }
            else{
                new_node.next=top;
                top=new_node;
            }
            System.out.println("do u want to insert more data :press-1");
            m=sc.nextInt();
        }
        while(m==1);
    }
    public void pop()
    {
        int m;
        Scanner sc= new Scanner(System.in);
        do{
            if(top==null)
            {
                System.out.println("Empty stack list");
    
            }
            else{
                Node temp=top;
                top=temp.next;
                System.out.println("items is deleted"+temp.data);
                temp.next=null;
    
            }
            System.out.println("do u want to pop more items press 1");
            m=sc.nextInt(); 
        }
        while(m==1);
    }
    public void display()
    {
        if(top==null)
        {
            System.out.println("stack list id empty");
        }
        else{
            Node temp=top;
            System.out.println("items are:");
            while(temp!=null)
            {
                
                System.out.println("\n" + temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Stacklist li=new Stacklist();
        li.push();
        li.pop();
        li.display();
    }
}