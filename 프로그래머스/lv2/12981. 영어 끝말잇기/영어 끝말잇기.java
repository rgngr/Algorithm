class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        Loop1 :
        for (int i=1; i<words.length; i++) {
            
            if (words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)) {
                if ((i+1)%n==0) {
                        answer[0] = n;
                        answer[1] = (i+1)/n;
                        break Loop1;
                    } else {
                        answer[0] = (i+1)%n;
                        answer[1] = (i+1)/n + 1;
                        break Loop1;
                    }
            }
                
                
            Loop2 :
            for (int j=0; j<i; j++) {
                if (words[i].equals(words[j])) {
                    if ((i+1)%n==0) {
                        answer[0] = n;
                        answer[1] = (i+1)/n;
                        break Loop1;
                    } else {
                        answer[0] = (i+1)%n;
                        answer[1] = (i+1)/n + 1;
                        break Loop1;
                    }
                }
            }
        }
        
        
        return answer;
    } 
}