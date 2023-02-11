class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double root = Math.sqrt(n);
        int num = (int) root;
        
        for (int i=1; i<=num; i++) {
            if (n%i==0) {
                answer++;
            }
        }
        
        answer *= 2;
        if (root==(double)num) {
            answer--;
        }
        return answer;
    }
}