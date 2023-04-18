import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        
        int[] sum = new int[score.length];
        for (int i=0; i<score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        int[] temp = sum.clone();
        Arrays.sort(sum);
        int[] answer = new int[score.length];
        
        for (int i=0; i<sum.length; i++) {
            for (int j=0; j<temp.length; j++) {
                if (sum[i]==temp[j]) {
                    answer[j] = sum.length-i;
                }
            }
        }
        
        return answer;
    }
}