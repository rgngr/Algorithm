class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int wmax = 0;
        int hmax = 0;


        for (int i=0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        for (int i=0; i < sizes.length; i++) {
                wmax = Math.max(wmax, sizes[i][0]);
        }

        for (int i=0; i < sizes.length; i++) {
            hmax = Math.max(hmax, sizes[i][1]);
        }

        answer = wmax * hmax;
        
        return answer;
    }
}