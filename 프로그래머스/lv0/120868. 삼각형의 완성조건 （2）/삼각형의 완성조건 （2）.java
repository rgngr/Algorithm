class Solution {
    public int solution(int[] sides) {
        
        int max = sides[0] + sides[1];
        int min = Math.abs(sides[0] - sides[1]);
        
        int answer = max - min -1;
        return answer;
    }
}