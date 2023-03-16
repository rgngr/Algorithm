class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] temp = my_string.split("");
        answer += temp[0];
        int count = 0;
        
        for (int i=1; i<temp.length; i++) {
            for (int j=0; j<i; j++) {
                if (temp[i].equals(temp[j])) {
                    count ++;
                    break;
                }
            }
            if (count == 0) {
                answer += temp[i];
            }
            count = 0;
        }
        
        return answer;
    }
}