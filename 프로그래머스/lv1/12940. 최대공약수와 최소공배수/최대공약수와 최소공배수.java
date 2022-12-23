class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;
        int a = 0;
        int b = 0;

        if (n <= m) {
            a = n;
        } else {
            a = m;
        }

        for (int i = a; i >= 1; i--) {
            if ((n % i == 0) && (m % i == 0)) {
                max = i;
                break;
            }
        }

        a = n / max;
        b = m / max;

        min = max * a * b;

        answer[0] = max;
        answer[1] = min;
            
        return answer;
    }
}