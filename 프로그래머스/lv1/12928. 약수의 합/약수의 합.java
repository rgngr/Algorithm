class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = (int) Math.sqrt(n);
        
        for (int i = 1; i <= a; i++) {
            if (n % i == 0) {
                int b = n / i;
                if (i == b) {
                    answer += i;
                } else {
                   answer += i;
                answer += b;  
                }
            }
        }
        return answer;
    }
}