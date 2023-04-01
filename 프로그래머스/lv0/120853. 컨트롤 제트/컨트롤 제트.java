class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] temp = s.split(" ");
        
        for (int i=0; i<temp.length-1; i++) {
            if ((!temp[i].equals("Z")) && (!temp[i+1].equals("Z"))) {
                answer += Integer.parseInt(temp[i]);
            }
        }
        
        if (!temp[temp.length-1].equals("Z")) answer += Integer.parseInt(temp[temp.length-1]);
            
        return answer;
    }
}