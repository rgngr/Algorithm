import java.util.Arrays;

class Solution {
    public int solution(int[] ds, int budget) {
        int answer = 0;
        
        Arrays.sort(ds);
        
        int sum = 0;
        int count = 0;
        
        for (int d : ds) {
            sum += d;
            count++;
            if (sum <= budget) {
                answer = count;
            }
        }
        
        return answer;
    }
}