class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for (int i=3; i<=area; i++) {
            if (area%i == 0) {
                if ((i-2)*(area/i-2)==yellow) {
                    answer[0] = i;
                    answer[1] = area/i;
                }
            }    
        }
        
        return answer;
    }
}