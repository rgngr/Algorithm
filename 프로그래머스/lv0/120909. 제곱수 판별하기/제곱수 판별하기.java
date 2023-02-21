class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = (int)Math.sqrt(n);
        if (Math.pow(a, 2) == n) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}