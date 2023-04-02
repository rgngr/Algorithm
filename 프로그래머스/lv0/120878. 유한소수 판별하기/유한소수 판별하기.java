class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int temp;
        
        if (a >= b) temp = b;
        else temp = a;
        
        for (int i=temp; i>0; i--) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
                break;
            }
        }
        
        while(b%2==0) {
            b /=2;
        }
        
        while(b%5==0) {
            b /=5;
        }
        
        if (b == 1) answer = 1;
        
        return answer;
    }
}