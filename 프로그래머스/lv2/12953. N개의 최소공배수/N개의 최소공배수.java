import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        List<Integer> list = new LinkedList<>();
        int count1 = 0;
        int count2= 0;

        for (int i=2; i<=100; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[j]%i == 0) {
                    arr[j] /= i;
                    count1++;
                }
                if (arr[j]==1) {
                    count2++;
                }
            }
            if (count1 > 0) {
                list.add(i);
                i--;
                count1 = 0;
            }
            if (count2 == arr.length) {
                break;
            }
            count2 = 0;
        }
        
        for (int i=0; i<list.size(); i++) {
            answer *= list.get(i);
        }
        
        return answer;
    }
}