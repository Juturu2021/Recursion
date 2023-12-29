// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//panindrome
import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int n = str.length();
      int i=0, j=n-1;
      if(palindrome(i, j, str)){
        System.out.print(1);
      }
      else{
        System.out.print(0);
      }
  }
  public static boolean palindrome(int i, int j, String str){
    if(i>=j){
      return true;
    }
    if(str.charAt(i) != str.charAt(j)){
      return false;
    }
    else{
      return palindrome(i+1, j-1, str);
    }
  }
}
