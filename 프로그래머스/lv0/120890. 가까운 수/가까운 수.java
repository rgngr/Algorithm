import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {

        Arrays.sort(array);
        int temp = 100;
        int abs;
        int j = -1;
        
        for (int i=0; i<array.length; i++) {
            abs = Math.abs(array[i]-n);            
            if (abs < temp) {
                temp = abs;
                j = i;
            }
        }
        
        return array[j];
    }
}