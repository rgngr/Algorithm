import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new LinkedList<>();
        
        int m = n;
        int count = 0;
        for (int i=2; i<=n; i++) {
            while (m%i==0) {
                m /= i;
                count++;
            }
            if (count > 0) {
                count = 0;
                answer.add(i);
            }
            if (m == 1) {
                break;  
            }
        }
        
        return answer;
    }
}