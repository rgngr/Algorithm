class Solution {
    public int solution(int[] nums) {

        int n = nums.length;
        int cases = (n * (n-1) * (n-2)) / 6;
        int[] sums = new int[cases];
        int index = 0;
        
        for(int i=0; i < nums.length-2; i++) {
            for(int j=i+1; j < nums.length-1; j++) {
                for(int k=j+1; k < nums.length; k++) {
                    sums[index] = nums[i] + nums[j] + nums[k];
                    index++;
                }
            }
        }
        
        
        for (int i=0; i < sums.length; i++) {
            for (int j=2; j < sums[i]; j++) {
                if (sums[i] % j == 0) {
                    sums[i] = 0;
                    break;
                }
            }
        }
        
        int count = 0;
        
        for (int i=0; i < sums.length; i++) {
            if (sums[i] == 0) {
                count++;
            }
        }
        
        int answer = cases - count;
        
        return answer;
    }
}