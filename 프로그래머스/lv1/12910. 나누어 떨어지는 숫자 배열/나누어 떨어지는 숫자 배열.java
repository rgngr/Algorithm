class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int a = 0;       
        int[] answer = null; 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;  
            }
        }
        
        if (count == 0) {
            answer = new int[] {-1}; 
        } else {
             answer = new int[count];  
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] % divisor==0) {
                     answer[a]=arr[i];
                     a++;
                 }
             }
             for(int i = 0; i < answer.length; i++) {
                 for(int j = i+1; j < answer.length; j++) {
                     if(answer[i] > answer[j]) {
					     int temp = answer[i];
					     answer[i] = answer[j];
					     answer[j] = temp;
				     }
			     }
		     }
          }
         
        return answer;
    }
}