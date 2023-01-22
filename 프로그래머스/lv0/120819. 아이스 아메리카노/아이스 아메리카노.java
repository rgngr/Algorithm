class Solution {
    public int[] solution(int money) {
        
        int max = money / 5500;
        int rest = money % 5500;
        
        int[] answer = {max, rest};        
        
        return answer;
    }
}