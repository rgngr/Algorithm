class Solution {
    public boolean solution(int x) {        
        int sum = 0;
        int n = x;

        while (n != 0) {
            int quo = n / 10;
            int rem = n % 10;
            
            sum += rem;
            n = quo;
        }
        
        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}