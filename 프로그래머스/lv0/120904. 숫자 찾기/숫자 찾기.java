class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String numStr =  Integer.toString(num);
        String kStr =  Integer.toString(k);
        
        String[] temp = numStr.split("");
        
        for (int i=0; i<temp.length; i++) {
            if (temp[i].equals(kStr)) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}