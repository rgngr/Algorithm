import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
         String answer = "";
				//배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

				//반복문을 돌려서 completion 배열과 participant배열의 다른곳을 찾기
        for (int i=0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }

        
        return answer;
    }
}