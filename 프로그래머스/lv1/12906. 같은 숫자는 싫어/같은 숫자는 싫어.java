import java.util.*;

public class Solution {
    public int[] solution(int []arrs) {
        
        int check = arrs[0];
        int count = 1;
        
        for (int arr : arrs) {
            if (check == arr) {
                continue;
            } else {
                check = arr; 
                count++;
            }
        }
        
        int[] answer = new int[count];
        answer[0] = arrs[0];
        int count2 = 0;
        
        for (int i = 1; i < arrs.length; i++) {
            if (arrs[i] == arrs[i-1]) {
                continue;
            } else {
                count2++;
                answer[count2] = arrs[i];
            }
        }
        
        System.out.println("Hello Java");

        return answer;
    }
}