/*
Problem Description
Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order
*/
public class Solution {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
      ArrayList<Integer> list = new ArrayList<>();
      boolean[] visitedArray = new boolean[A.size()];
      solve(0, visitedArray, A, list);
      return result;
    }
    public void solve(int index, boolean[] visitedArray, ArrayList<Integer> A, ArrayList<Integer> list){
      if(index == A.size()){
        result.add(new ArrayList<>(list));
      }
      for(int i=0; i<visitedArray.length; i++){
        if(visitedArray[i] == false){
          list.add(A.get(i));
          visitedArray[i] = true;
          solve(index+1, visitedArray, A, list);
          //the below statement is for backtracking
          list.remove(list.size()-1);
          visitedArray[i] = false;
        }
      }
    }
}
