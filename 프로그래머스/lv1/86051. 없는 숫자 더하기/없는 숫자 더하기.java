import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        
        Arrays.sort(numbers);
        
        for(int i=0; i<10; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(numbers[j] == i) {
                    count++;
                }
            }
            if(count == 0) {
                answer += i;
            }
            count = 0;
        }
        
        return answer;
    }
}