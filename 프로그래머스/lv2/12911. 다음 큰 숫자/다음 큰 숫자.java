class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=n+1; true; i++) {
            String binaryN = Integer.toBinaryString(n);
            String binaryNn = Integer.toBinaryString(i);
            int numN1 = binaryN.replace("0","").length();
            int numNn1 = binaryNn.replace("0","").length();
            
            if (numN1 == numNn1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}