class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if (num%2==0) {
            int temp = total/num;
            for (int i=num/2-1; i>=0; i--) {
                answer[i] = temp--;
            }
            temp = total/num;
            for (int i=num/2; i<num; i++) {
                answer[i] = ++temp;
            }
        } else {
            int temp = total/num;
            for (int i=num/2; i>=0; i--) {
                answer[i] = temp--; 
            }
            temp = total/num;
            for (int i=num/2+1; i<num; i++) {
                answer[i] = ++temp;
            }
        }
        
        return answer;
    }
}