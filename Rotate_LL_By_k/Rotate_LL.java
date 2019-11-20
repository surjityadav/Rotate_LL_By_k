
import java.util.Scanner;


public class Rotate_LL_By_k {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void insert(int key)
    {
        Node temp=head;
        if(temp==null)
        {
            head=new Node(key);
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node newNode=new Node(key);
        temp.next=newNode;
        newNode.next=null;
    }
    public static void rotate(Rotate_LL_By_k li,int k)
    {
        if(k==0)
        {
            System.out.println("Enter value greater than 0");
        }
        Node current =head;
        int count=1;
        while(count<k && current!=null)
        {
            current=current.next;
            count++;
        }
        if(current==null)
        {
            return;
        }
        Node temp=current;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=head;
        head=temp.next;
        temp.next=null;
    }
    public static void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Rotate_LL_By_k li=new Rotate_LL_By_k();
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            insert(m);
        }
        System.out.println("Enter value of k");
        int k=sc.nextInt();
        System.out.println("LinkedList Before rotation:");
           display();
           System.out.println();
        rotate(li,k);
        System.out.println("LinkedList After rotation:");
        display();
    }

}
