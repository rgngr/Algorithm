import java.io.IOException;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double a = (double) Math.sqrt(n);
        long b = (long) Math.ceil(a);
        long c = (long) Math.floor(b);
        
        if (a == b) {
            answer = (long)Math.pow(a+1, 2);    
        } else {
            answer = -1;
        }
        
        return answer;
    }
}