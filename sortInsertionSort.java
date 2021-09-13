import java.util.*;

class sortInsertionSort
{
  public static void main(String[] args)
  {
      int[] a={1,4,7,2,5,1,6,8,34,0,23,122,3,4,5};
      int n=a.length;int tmp;
      for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {
          if(a[i]>a[j])
          {
            tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
          }
        }
      }
      for(int i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
  }
}
