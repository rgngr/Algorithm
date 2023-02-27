class Solution {
    public String solution(String my_string) {
        
        char[] arr = my_string.toCharArray();
        
        for (int i=0; i<arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        } 
        
        String answer = new String(arr);
        return answer;
    }
}