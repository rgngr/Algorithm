class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int zero = 0;
                
        for (int i=0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
        }
        
        int same = 0;
        
        for (int i = 0; i < lottos.length; i++) {           
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    same++;
                }
            }
        }
        
        int highest = 7-(same + zero);
        if (highest == 7) {
            highest = 6;
        }
        
        int lowest = 7-same;
        if (lowest == 7) {
            lowest = 6;
        }
        
        int[] answer = {highest, lowest};
            
        return answer;
    }
}