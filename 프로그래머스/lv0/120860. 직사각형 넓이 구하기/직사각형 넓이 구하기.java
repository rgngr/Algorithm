class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int length = 0;
        
        for (int i=1; i<dots.length; i++) {
            if (dots[0][1] == dots[i][1]) {
                width = Math.abs(dots[i][0] - dots[0][0]);
                break;
            }
        }
        
        for (int i=1; i<dots.length; i++) {
            if (dots[0][0] == dots[i][0]) {
                length = Math.abs(dots[i][1] - dots[0][1]);
                break;
            }
        }
        
        int answer = width * length;
        
        return answer;
    }
}