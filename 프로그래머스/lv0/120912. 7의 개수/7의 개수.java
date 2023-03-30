class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String sum = "";
        
        String[] temp1 = new String[array.length];
        for (int i=0; i<array.length; i++) {
            temp1[i] = Integer.toString(array[i]);
            sum += temp1[i];
        }
        
        String[] temp2 = sum.split("");
        for (int i=0; i<temp2.length; i++) {
            if (temp2[i].equals("7")) {
                answer++;
            }
        }
        
        return answer;
    }
}