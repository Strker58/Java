import java.util.*;

class sortInsertionSort
{
  public static void main(String[] args)
 {
     int[] a={1,4,7,2,5,1,6,8,34,0,23,122,3,4,5};
     int n=a.length;int tmp;
     for(int i=1;i<n;i++)
     {
       int j=i-1;
       tmp=a[i];
       while(j>=0 && a[j]>tmp)
       {
         a[j+1]=a[j];
         j--;
       }
       a[j+1]=tmp;
     }
     for(int i=0;i<n;i++)
     {
       System.out.print(a[i]+" ");
     }
 }
}
