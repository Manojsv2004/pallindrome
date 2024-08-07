import java.util.*;
class Pallindrome{
  public static void main(String[] args) {
    String reverse="";
  Scanner in = new Scanner(System.in);
  String original= in.nextLine();
  int length = original.length();
  for(int i = length-1;i>=0;i--)
	  reverse= reverse+original.charAt(i);
  if(original.equals(reverse))
	  System.out.println("It's a Pallindrome");
  else
	  System.out.println("Not a Pallindrome");
  }
}
