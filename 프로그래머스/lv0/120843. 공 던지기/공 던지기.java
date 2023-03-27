class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int n = 1;
        int m = 2;
        int[] temp = {};
        
        if (numbers.length%2==1) {
            temp = new int[numbers.length];
            for (int i=0; i<temp.length; i++) {
                if (i<= numbers.length/2) {
                    temp[i] = n;
                    n += 2;
                } else {
                    temp[i] = m;
                    m += 2;
                }
            }
        } else {
            temp = new int[numbers.length/2];
            for (int i=0; i<temp.length; i++) {
                temp[i] = n;
                n += 2;
            }
        }
        
        int length = k%temp.length;
            if (length == 0) {
                answer = temp[temp.length-1];
            } else {
                answer = temp[length-1];
            }
        
        return answer; 
    }
}