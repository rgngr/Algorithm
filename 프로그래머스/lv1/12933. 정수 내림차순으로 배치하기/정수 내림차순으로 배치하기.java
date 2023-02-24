import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = "";

        String strN = Long.toString(n);
        String[] arr = strN.split("");
        Arrays.sort(arr);
        
        for (int i=arr.length-1; i>=0; i--) {
            temp += arr[i];
        }

        answer = Long.valueOf(temp);
        return answer;
    }
}