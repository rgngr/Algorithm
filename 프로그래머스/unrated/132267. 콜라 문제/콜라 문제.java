class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = n;
        
        while(temp>=a) {
            answer += (temp/a) * b;
            temp = temp%a + (temp/a) * b;
        }
        
        return answer;
    }
}