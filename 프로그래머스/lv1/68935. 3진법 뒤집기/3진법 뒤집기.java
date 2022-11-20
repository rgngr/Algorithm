class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = n;
        int count = 0;
        
        while (a > 0) {
            a /=3;
            count++;
        }

        int b = n;
        int rem = 0;
        
        while (b > 0) {
            rem = b % 3;
            b /= 3;

            answer += rem * Math.pow(3, count-1);
            count--;
        }
        
        return answer;
    }
}