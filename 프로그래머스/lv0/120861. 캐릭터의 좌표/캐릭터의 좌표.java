class Solution {
    public int[] solution(String[] key, int[] board) {
        int x = 0;
        int y = 0;
        int xMax = board[0]/2;
        int xMin = -board[0]/2;
        int yMax = board[1]/2;
        int yMin = -board[1]/2;
        
        for (int i=0; i<key.length; i++) {
            if (key[i].equals("up") && y<yMax) {
                y++;
            } else if (key[i].equals("down") && y>yMin) {
                y--;
            } else if (key[i].equals("left") && x>xMin) {
                x--;
            } else if (key[i].equals("right") && x<xMax) {
                x++;
            }
        }
        
        int[] answer = {x, y};
        return answer;
    }
}