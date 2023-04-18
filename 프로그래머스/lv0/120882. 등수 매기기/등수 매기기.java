import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        
        double[] avg = new double[score.length];
        for (int i=0; i<score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / (double)2;
        }
        
        double[] temp = avg.clone();
        Arrays.sort(avg);
        int[] answer = new int[score.length];
        
        for (int i=0; i<avg.length; i++) {
            for (int j=0; j<temp.length; j++) {
                if (avg[i]==temp[j]) {
                    answer[j] = avg.length-i;
                }
            }
        }
        
        return answer;
    }
}