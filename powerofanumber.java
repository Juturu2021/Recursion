// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int expo = sc.nextInt();
    System.out.print(power(num, expo));
  }
  public static int power(int a, int b){
    if(b==0){
      return 1;
    }
    return power(a, b-1) * a;
  }
}
