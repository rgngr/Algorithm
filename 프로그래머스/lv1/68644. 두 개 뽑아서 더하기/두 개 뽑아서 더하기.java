import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        int n = numbers.length;
        int cases = (n * (n-1)) / 2;
        
        int[] temp = new int[cases];
        int index = 0;
        
        for(int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                temp[index] = numbers[i] + numbers[j];
                index++;
            }
        }
        
        Arrays.sort(temp);
        
        int check = temp[0];
        int count = 1;
        
        for (int tem : temp) {
            if (check == tem) {
                continue;
            } else {
                check = tem; 
                count++;
            }
        }
        
        int[] answer = new int[count];
        answer[0] = temp[0];
        int count2 = 0;
        
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == temp[i-1]) {
                continue;
            } else {
                count2++;
                answer[count2] = temp[i];
            }
        }
        
        return answer;
    }
}