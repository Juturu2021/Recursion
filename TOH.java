public class Solution {
  ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
      TOH(A, 1, 2, 3);
      return result;
    }
  public void TOH(int A, int source, int helper, int destination){
    ArrayList<Integer> list = new ArrayList<>();
    if(A==0){
      return;
    }
    TOH(A-1, source, destination, helper);
    list.add(A);
    list.add(source);
    list.add(destination);
    result.add(list);
    TOH(A-1, helper, source, destination);
  }
}
