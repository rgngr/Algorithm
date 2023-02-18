class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("");
        
        for (int i=0; i<arr.length; i++) {
            try {
                int temp = Integer.parseInt(arr[i]);
                answer += temp;
            } catch (NumberFormatException ex) {
                continue;
            }
        }
        
        return answer;
    }
}