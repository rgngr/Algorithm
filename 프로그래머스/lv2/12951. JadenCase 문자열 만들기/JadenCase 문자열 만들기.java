class Solution {
    public String solution(String s) {
        String answer = "";

        s = s.toLowerCase();
        String[] arr = s.split("");
        
        arr[0] = arr[0].toUpperCase();
        
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1].equals(" ") && !arr[i].equals(" ")) {
                arr[i] = arr[i].toUpperCase();
            }
        }
        
        for (int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}