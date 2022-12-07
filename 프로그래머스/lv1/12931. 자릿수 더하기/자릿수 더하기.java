import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        while (n != 0) {
            int quotient = n / 10;
            int remainder = n % 10;
            
            sum += remainder;
            n = quotient;
        }
        
        answer = sum;
        return answer;
    }
}