import java.util.*;

class Fibonacci
{
  public static int FibonacciIterative(int number)
  {
    int[] sum=new int[number+1];sum[1]=1;
    if(number==1) return 1;
    for(int i=2;i<=number;i++)
    {
      sum[i]=sum[i-1]+sum[i-2];
    }
    return sum[number];
  }
  public static int FibonacciRecurssive(int number)
  {
    if(number<2) return number;
    else return FibonacciRecurssive(number-1)+FibonacciRecurssive(number-2);

    // if(number<2) return number;
    // else return number-1+FibonacciRecurssive(number-2);
  }

  public static void main(String[] args)
  {
    System.out.println("Recursive value: "+FibonacciRecurssive(3));
    System.out.println("Iterative value: "+FibonacciIterative(4));
  }
}
