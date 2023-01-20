class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        String[] arr = s.split("");
        
        if (arr.length == 4 || arr.length == 6) {
            for (int i=0; i<arr.length; i++) {
                try {
                    Integer.parseInt(arr[i]);
                } catch (NumberFormatException ex) {
                    return false;
                }    
            }
            return true;
        } else {
            return false;
        }
        
    }
}