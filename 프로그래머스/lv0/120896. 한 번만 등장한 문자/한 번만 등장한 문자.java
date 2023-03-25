import java.util.Arrays;

class Solution {
    public String solution(String s) {
        if (s.length()==1) {
            return s;
        }
        
        String answer = "";
        
        String[] temp = s.split("");
        Arrays.sort(temp);
        
        if (!temp[0].equals(temp[1])) {
            answer += temp[0];
        }
        
        for (int i=1; i<temp.length-1; i++) {
            if ((!temp[i].equals(temp[i-1])) && (!temp[i].equals(temp[i+1]))) {
                answer += temp[i];
            }
        }
        
        if (!temp[temp.length-1].equals(temp[temp.length-2])) {
            answer += temp[temp.length-1];
        }
        
        return answer;
    }
}