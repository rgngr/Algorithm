class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i=0; i<rsp.length(); i++) {
            char charAt = rsp.charAt(i);
            if (charAt=='2') {
                answer += "0";
            } else if (charAt=='0') {
                answer += "5";
            } else if (charAt=='5') {
                answer += "2";
            }
        }
        
        return answer;
    }
}