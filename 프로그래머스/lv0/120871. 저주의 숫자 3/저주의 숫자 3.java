class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for (int i=1; i>0; i++) {
            if (i % 3 != 0) {
                String temp = Integer.toString(i);
                if (!temp.contains("3")) {
                    count++;
                    if (count == n) {
                        answer = i;
                        break;
                    }
                }
            }  
        }
        
        return answer;
    }
}