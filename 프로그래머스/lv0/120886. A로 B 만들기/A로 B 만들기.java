import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int count = 0;
        
        String[] tempB = before.split("");
        Arrays.sort(tempB);
        
        String[] tempA = after.split("");
        Arrays.sort(tempA);
        
        for (int i=0; i<tempA.length; i++) {
            if (tempB[i].equals(tempA[i])) {
                count++;
            }
        }
        
        if (count == tempA.length) answer = 1;
        
        return answer;
        
        // 다른 사람 풀이
//         char[] a = before.toCharArray();
//         char[] b = after.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);

//         return new String(a).equals(new String(b)) ? 1 :0;
    }
}
