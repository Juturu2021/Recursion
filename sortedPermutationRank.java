public class Solution {
    public static int factorial(int n){
      int mod = 1000003;
      if(n==0){
        return 1;
      }
      return (factorial(n-1) * n)%mod;
    }
    public int findRank(String A) {
      int n = A.length();
      int mod = 1000003;
      int ans = 0;
      for(int i=0; i<n-1; i++){
        int count = 0;
        for(int j=i+1; j<n; j++){
          if(A.charAt(j) < A.charAt(i)){
            count++;
          }
        }
        ans = (ans + (((count%mod) * (factorial(n-i-1))%mod))%mod)%mod;
      }
      return ans+1;
    }
}
