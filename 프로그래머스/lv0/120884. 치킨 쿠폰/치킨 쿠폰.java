class Solution {
    public int solution(int chicken) {
        int share = chicken/10;
        int remain = chicken%10;
        int answer = 0;
        
        while (share != 0) {
            answer += share;
            remain += share;
            share = remain/10;
            remain %= 10;
        }
        
        return answer;
    }
}