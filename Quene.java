import java.util.*;

class Queues
{
  Node front=null;
  Node back=null;
  class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      this.data=d;
      this.next=null;
    }
  }

  public static Queues enquene(Queues list,int data)
  {
    Node new_node=new Node(data);
    if(list.front==null)
    {
      list.front=new_node;
      list.front=list.back;
    }
    else
    {
      Node currNode=list.back;
      currNode.next=new_node;
      list.back=currNode.next;
    }
    return list;
  }

  public static Queues dequene(Queues list)
  {
    if(list.front==null)
    {
      list=null;
    }
    else
    {
      Node n=list.front;
      list.front=null;
      n=n.next;
      list.front=n;
    }
    return list;
  }

  public static void display(Queues list)
  {
    Node curr=list.front;
    while(curr!=null)
    {
      System.out.print(curr.data+" ");
    }
    System.out.println();
  }

  public static void main(String[] args)
  {
    Queues l=new Queues();
    enquene(l,1);
    enquene(l,32);
    enquene(l,3);
    enquene(l,10);
    enquene(l,12);
    display(l);
    dequene(l);
    dequene(l);
    display(l);
  }

}
