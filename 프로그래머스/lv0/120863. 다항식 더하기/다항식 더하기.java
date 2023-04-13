class Solution {
    public String solution(String poly) {
        
        String[] temp = poly.split(" ");
        
        int coef = 0;
        int cons = 0;
        
        for(int i=0; i<temp.length; i++) {
            if(temp[i].contains("x")) {
                if(temp[i].equals("x")) {
                    coef += 1;
                } else {
                    String[] temp2 = temp[i].split("x");
                    coef += Integer.parseInt(temp2[0]);
                }
            } else if (temp[i].equals("+")){
               continue; 
            } else {
                cons += Integer.parseInt(temp[i]);
            } 
        }
        
        String answer = "";
        if (coef == 0) {
            answer = Integer.toString(cons);
        } else if (coef ==1) {
            if (cons == 0) {
                answer = "x";
            } else {
                answer = "x + " + cons;
            }
        } else {
            if (cons == 0) {
                answer = coef + "x";
            } else {
                answer = coef + "x + " + cons;   
            }
        }
        
        return answer;
    }
}