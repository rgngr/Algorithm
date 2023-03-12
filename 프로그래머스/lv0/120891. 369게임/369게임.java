class Solution {
    public int solution(int order) {
        int answer = 0;
        
        int temp = 0;        
        int length = (int)(Math.log10(order)+1);
        
        for (int i=0; i<length; i++) {
            temp = order % 10;
            order /= 10;
            if ((temp != 0) && (temp % 3 == 0)) {
                answer++;
            }
        }
        
        return answer;
    }
}