class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long sum = 0;
        
        for (long i=1; i<=count; i++) {
            sum += i;
        }
        
        sum *= price;
        
        if (money < sum) {
            answer = sum - money;
        }

        return answer;
    }
}