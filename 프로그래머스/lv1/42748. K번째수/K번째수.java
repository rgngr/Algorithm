import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            
            int length = commands[i][1] - commands[i][0] + 1;
            int[] command = new int[length];
            
            for (int j = 0; j < length; j++) {
                int c = commands[i][0] - 1;
                command[j] = array[c + j];
            }
            
            Arrays.sort(command);
            
            int cc = commands[i][2] - 1;
            
            answer[i] = command[cc];
            
        }
        
        return answer;
    }
}