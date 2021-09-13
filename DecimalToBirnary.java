import java.util.*;

class DecimalToBinary
{
  public static String Binarynumberof1(int num)
  {
    String val="";
    int n;
    if(num==0) return "";
    n=num%2;
    val+=n;
    return Binarynumberof1(num/2)+val;
  }

  public static String Binarynumberof2(int num,String result)
  {
    if(num==0) return result;
    result=num%2+result;
    return Binarynumberof2(num/2,result);
  }


  public static void main(String[] args)
  {
    System.out.println(Binarynumberof1(100));
    System.out.println(Binarynumberof2(100,""));
  }
}
