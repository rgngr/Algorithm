import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        String[] temp = my_string.split("");
        Arrays.sort(temp);
        
        for (int i=0; i<temp.length; i++) {
            answer += temp[i];
        }
        
        return answer;
    }
}