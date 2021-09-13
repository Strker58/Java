import java.util.*;


class Stacks
{
  Node head=null;
  Node top=null;
  static class Node
  {

    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }


  public static Stacks push(Stacks list,int data)
  {
    Node top;
    Node new_node=new Node(data);
    Node tmp;
    new_node.next=null;
    if(list.head==null)
    {
      list.head=new_node;
      list.top=list.head;
    }
    else
    {
    tmp=new_node;
    tmp.next=list.top;
    list.top=tmp;
    }
    return list;

  }

  public static Stacks pop(Stacks list)
  {
    Node todel;
    todel=list.top;
    todel=null;
    list.top=list.top.next;
    return list;
  }

  public static void display(Stacks list)
  {
      Node N=list.top;
    while(N!=null)
    {
      System.out.print(N.data+" ");
      N=N.next;
    }
    System.out.println();
  }

  public static void main(String[] args)
  {
    Stacks st=new Stacks();
    push(st,29);
    push(st,23);
    push(st,24);
    display(st);
    pop(st);
    display(st);
  }

}
