class Solution {
    public int[] solution(int n, int s) {
        
        if (s < n) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[n];
        int share = s/n;
        int remain = s%n;
        
        for (int i=0; i<n; i++) {
            answer[i] = share;
        }
        
        if (remain != 0) {
            for (int i=n-remain; i<n; i++) {
                answer[i]++;
            }
        }
        
        return answer;
    }
}