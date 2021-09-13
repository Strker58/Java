import java.util.*;

class StringReversal
{
  public static String reverseString(String words)
  {
    if(words=="") return "";
    return reverseString(words.substring(1))+words.charAt(0);
  }
  public static void main(String[] args)
  {
    System.out.println(reverseString("Hellooo"));
  }
}
