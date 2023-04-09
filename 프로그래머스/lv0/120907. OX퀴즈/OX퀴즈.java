class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            
            String[] temp = quiz[i].split(" ");
            
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[2]);
            int c = Integer.parseInt(temp[4]);
                
            if (temp[1].equals("-")) {
                if (a - b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (a + b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}