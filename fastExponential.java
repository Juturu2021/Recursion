// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int n = sc.nextInt();
      int ans = power(a,n);
      System.out.print(ans);

  }
  public static int power(int a, int n){
      if(n==0){
        return 1;
      }
      int temp = power(a, n/2);
      if(n%2 == 0){
        return temp * temp;
      }
      else{
        return temp * temp * a;
      }
  }
}
