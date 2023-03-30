class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String temp = "";
        
        for (int l=i; l<=j; l++) {
            temp += Integer.toString(l);
        }
        
        String[] temp2 = temp.split("");
        String kk = Integer.toString(k);
        for (int m=0; m<temp2.length; m++) {
            if (temp2[m].equals(kk)) {
                answer++;
            }
        }
        
        return answer;
    }
}