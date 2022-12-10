class Solution {
    public int solution(int n) {
        int self = 1;        
        int count = 0;
        
        for (int i=1; i <= n / 2; i++) {
            
            int even = 2 * i;
            if ((n % even == i) && (n / even >= i)) {
                    count++;
            }
            
            int odd = 2 * i + 1;
            if ((n % odd == 0) && (n / odd >= odd/2+1)) {
                    count++;
            }
        }

        int answer = count + self;
        return answer;
    }
}