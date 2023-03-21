class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] temp = s.split("");
        int index = 0;
        
        for (int i=0; i<temp.length; i++) {
            if (temp[i].equals(" ")) {
                index = -1;
            } else {
                if (index%2 == 0) {
                    temp[i] = temp[i].toUpperCase();
                } else {
                    temp[i] = temp[i].toLowerCase();
                }
                
            }
            
            index++;
        }
        
        for (int i=0; i<temp.length; i++) {
            answer += temp[i];
        }
        
        return answer;
    }
}