class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int kk = n / 10;
        
        answer = (n * 12000) + ((k - kk) * 2000);
        
        return answer;
    }
}