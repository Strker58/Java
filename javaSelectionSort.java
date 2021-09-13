import java.util.*;

class javaSelectionSort
{
  public static void main(String[] args)
  {
    int[] a={1,4,7,2,5,1,6,8,34,0,23,122,3,4,5};
    int n=a.length;int tmp;int small;
    for(int i=0;i<n;i++)
    {
      small=i;
      for(int j=i;j<n;j++)
      {
        if(a[small]>a[j])
        {
          small=j;
        }
      }
      tmp=a[small];
      a[small]=a[i];
      a[i]=tmp;
    }

    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}
