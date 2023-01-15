import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] stringArr = s.split(" ");
        int[] intArr = new int[stringArr.length];
        for (int i=0; i<stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        
        Arrays.sort(intArr);
        
        int min = intArr[0];
        int max = intArr[intArr.length-1];

        answer = min+" "+max;
        return answer;
    }
}