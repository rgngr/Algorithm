import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split("");
        Arrays.sort(array,Collections.reverseOrder());

        for (int i=0; i < array.length; i++) {
           answer += array[i];
        }
        
        return answer;
    }
}