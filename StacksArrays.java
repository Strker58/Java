import java.util.*;
class StacksArray
{
  static int length=0;
  public static int[] push(int[] arr,int data)
  {
    arr[length]=data;
    length++;
    return arr;
  }
  public static int[] pop(int[] arr)
  {
    arr[length]=0;
    length--;
    return arr;
  }
  public static void display(int[] arr)
  {
    for(int i=0;i<length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args)
  {
    int[] d=new int[100];
    push(d,10);
    push(d,121);
    push(d,11);
    push(d,1);
    push(d,12);
    display(d);
    pop(d);
    pop(d);
    display(d);
  }
}
