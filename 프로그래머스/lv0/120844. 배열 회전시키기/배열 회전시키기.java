class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("left")) {
            int temp = numbers[0];
            for (int i=1; i<numbers.length; i++) {
                answer[i-1] = numbers[i];
            }
            answer[numbers.length-1] = temp;
        } else {
            int temp = numbers[numbers.length-1];
            for (int i=numbers.length-1; i>0; i--) {
                answer[i] = numbers[i-1];
            }
            answer[0] = temp;
        }
        
        return answer;
    }
}