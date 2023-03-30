class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String sum = "";
        
        String[] temp = new String[array.length];
        for (int i=0; i<array.length; i++) {
            temp[i] = Integer.toString(array[i]);
            sum += temp[i];
        }
        
        for (int i=0; i<sum.length(); i++) {
            if (sum.charAt(i)=='7') {
                answer++;
            }
        }
        
        return answer;
    }
}