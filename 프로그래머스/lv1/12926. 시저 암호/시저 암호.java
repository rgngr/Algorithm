class Solution {
    public String solution(String s, int n) {
        
        char[] charArr = s.toCharArray();

        for (int i=0; i < charArr.length; i++) {
            if (charArr[i] == 32) {
                continue;
            } else if ((64 < charArr[i]) &&(charArr[i] < 91)) {
                charArr[i] += n;
                if (90 < charArr[i]) {
                    charArr[i] -= 26;
                }
            } else if ((96 < charArr[i]) &&(charArr[i] < 123)) {
                charArr[i] += n;
                if (122 < charArr[i]) {
                    charArr[i] -= 26;
                }
            }
        }

        String answer = "";
        
        for (int i=0; i < charArr.length; i++) {
            answer += charArr[i];
        }
        
        return answer;
    }
}