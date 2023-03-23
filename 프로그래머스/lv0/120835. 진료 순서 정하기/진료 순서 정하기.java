import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone();
        
        Arrays.sort(temp);
        
        for (int i=0; i<temp.length; i++) {
            for (int j=0; j<emergency.length; j++) {
                if (temp[i] == emergency[j]) {
                    answer[j] = temp.length-i;
                    break;
                }
            }
        }
        
        return answer;
    }
}