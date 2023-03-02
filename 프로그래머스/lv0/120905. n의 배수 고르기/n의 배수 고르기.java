import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> temp = new ArrayList<Integer>();
        
        for (int i=0; i<numlist.length; i++) {
            if (numlist[i] % n == 0) {
                temp.add(numlist[i]);
            }
        }
        
        int[] answer = new int[temp.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}