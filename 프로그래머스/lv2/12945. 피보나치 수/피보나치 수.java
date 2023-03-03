class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] temp = new int[n+1];
        temp[0] = 0;
        temp[1] = 1;
        
        // 오버플로가 발생하기 때문에, 전부 나눠서 넣기
        // 더하고 나누나 나눈 것끼리 더하고 나누나 또이또이
        for (int i=2; i<n+1; i++) {
            temp[i] = (temp[i-1] + temp[i-2]) % 1234567;
        }
        
        answer = temp[n];
        
        return answer;
    }
}