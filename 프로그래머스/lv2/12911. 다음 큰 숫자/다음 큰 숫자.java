class Solution {
    public int solution(int n) {
        int answer = 0;
        String binaryN = Integer.toBinaryString(n);
        int numN1 = binaryN.replace("0","").length();
        
        for (int i=n+1; true; i++) {
            
            String binaryNn = Integer.toBinaryString(i);
            int numNn1 = binaryNn.replace("0","").length();
            
            if (numN1 == numNn1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}