class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            double a = (double) Math.sqrt(i);
            long b = (long) Math.ceil(a);
            
            if (a == b) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        
        return answer;
    }
}