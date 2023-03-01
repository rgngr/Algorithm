import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        String[] temp = my_string.split("");
        Arrays.sort(temp);
        int index = 0;
        
        for (int i=0; i<temp.length; i++) {
            try {
                Integer.parseInt(temp[i]);
                index++;
            } catch (NumberFormatException ex) {
                break;
            }
        }
        
        int[] answer = new int[index];
        
        for (int i=0; i<index; i++) {
            answer[i] = Integer.parseInt(temp[i]);
        }
        
        return answer;
    }
}