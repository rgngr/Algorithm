class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;

        String[] array = s.split("");
        
        for(int i=0; i<array.length; i++) {
            if(array[i].equals("p") || array[i].equals("P")) {
                countP++;
            } else if(array[i].equals("y")|| array[i].equals("Y")) {
                countY++;
            }
        }

        if (countP == countY) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}