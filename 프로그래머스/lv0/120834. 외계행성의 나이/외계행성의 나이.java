class Solution {
    public String solution(int age) {
        String answer = "";
        String[] temp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        int length = (int)(Math.log10(age)+1);
        int[] tempAge = new int[length];
        
        for (int i=length-1; i>=0; i--) {
            tempAge[i] = age % 10;
            age /= 10;
        }
        
        for (int i=0; i<length; i++) {
            answer += temp[tempAge[i]];
        }
            
        return answer;
    }
}