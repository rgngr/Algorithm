class Solution {
    public int solution(long n) {
        int count = 0;
            
        if (n == 1) {
            return 0;
        }
        
        while (true) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n = n * 3 +1;
                count++;
            }

            if (n == 1) {
                return count;
            }
            
            if (count == 500) {
                return -1;
            }
        }
    }
}