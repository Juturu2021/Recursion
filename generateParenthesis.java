public class Solution {
    ArrayList<String> result = new ArrayList<>();
    public ArrayList<String> generateParenthesis(int A) {
      solution(A, "", 0, 0);
      return result;
    }
    public void solution(int A, String str, int open_bracket, int closed_bracket){
      if(str.length() == 2 * A){
        result.add(str);
      }
      if(open_bracket < A){
        solution(A, str+"(", open_bracket+1, closed_bracket);
      }
      if(closed_bracket < open_bracket){
        solution(A, str+")", open_bracket, closed_bracket+1);
      }
    }
}
