import java.util.*;

class recursivefact
{
  public static int recursivefactorial(int number)
  {
    if(number==0) return 1;
    return number*recursivefactorial(number-1);
  }


  public static int fact(int number)
  {
    int f=1;
    if(number==1||number==0) return 0;
    for(int i=number;i>0;i--)
    {
      f=f*i;
    }
    return f;
  }

  public static void main(String[] args)
  {
    System.out.println("Recursive value: "+recursivefactorial(3));
    System.out.println("Iterative value: "+fact(4));
  }
}
