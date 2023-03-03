class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int[][] temp1 = new int[n][n];
        int[][] temp2 = new int[n][n];
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                temp1[i][n-1-j] = arr1[i] % 2;
                temp2[i][n-1-j] = arr2[i] % 2;
                arr1[i] /= 2;
                arr2[i] /= 2;
            }
        }
        
        for (int i=0; i<n; i++) {
            answer[i] = "";
            for (int j=0; j<n; j++) {
                if ((temp1[i][j]==0) && (temp2[i][j]==0)) {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }
        
        return answer;
    }
}
