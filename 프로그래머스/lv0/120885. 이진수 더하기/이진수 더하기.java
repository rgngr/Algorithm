class Solution {
    public String solution(String bin1, String bin2) {
        
        int temp1 = Integer.parseInt(bin1, 2);
        int temp2 = Integer.parseInt(bin2, 2);
        
        int temp = temp1 + temp2;
        
        String answer = Integer.toString(temp, 2);
        
        return answer;
    }
}