class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int num0 = 0;
        int num1 = 0;
        int count = 0;
        
        while(true) {
            
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i)=='1') {
                    num1++;
                }
            }
            
            int temp0 = s.length() - num1;
            num0 += temp0;
            
            s = Integer.toBinaryString(num1);
            num1 = 0;
            count ++;
            
            if (s.equals("1")) {
                answer[0] = count;
                answer[1] = num0;
                break;
            }
        }
        
        return answer;
    }
}