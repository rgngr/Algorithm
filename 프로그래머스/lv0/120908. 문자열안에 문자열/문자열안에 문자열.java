class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        String[] arr1 = str1.split("");
        int length = str2.length();
        
        String temp = "";
        for (int i=0; i<arr1.length-length+1; i++) {
            for (int j=i; j<i+length; j++) {
                temp += arr1[j];
            }
            if (temp.equals(str2)) {
                answer = 1;
            }
            temp = "";
        }
        
        return answer;
    }
}