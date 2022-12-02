class Solution {
    public int solution(int[][] board, int[] moves) {
        
        int[] box = new int[moves.length];
        int index = 0;
        int count = 0;

        for (int i=0; i < moves.length; i++) {
            for (int j=0; j < board.length; j++) {
                int num = board[j][moves[i]-1];
                if (num != 0) {
                    box[index] = num;
                    board[j][moves[i]-1] = 0;
                    if (index == 0) {
                        index++;
                        break;
                    }
                    if (box[index] == box[index-1]) {
                        count++;
                        index--;
                    } else {
                        index++;
                    }
                    break;
                }
            }
        }

        int answer = 2 * count;
        return answer;
    }
}