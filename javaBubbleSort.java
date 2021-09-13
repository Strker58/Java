import java.util.*;

class javaBubbleSort
{
  public static void main(String[] args)
 {
   int[] a={1,4,7,2,5,1,6,8,34,0,23,122,3,4,5};
   int n=a.length;int tmp;
   for(int i=0;i<n-1;i++)
   {
     for(int j=0;j<n-1;j++)
     {
       if(a[j]>a[j+1])
       {
         tmp=a[j];
         a[j]=a[j+1];
         a[j+1]=tmp;
       }
     }
   }
   for(int i=0;i<n;i++)
   {
     System.out.print(a[i]+" ");
   }
 }
}
