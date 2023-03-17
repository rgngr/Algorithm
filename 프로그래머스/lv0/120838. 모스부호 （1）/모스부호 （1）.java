class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] temp = letter.split(" ");
        
        for (int i=0; i<temp.length; i++) {
            switch (temp[i]) {
                case ".-" : temp[i] = "a"; break;
                case "-..." : temp[i] = "b"; break;
                case "-.-." : temp[i] = "c"; break;
                case "-.." : temp[i] = "d"; break;
                case "." : temp[i] = "e"; break;
                case "..-." : temp[i] = "f"; break;
                case "--." : temp[i] = "g"; break;
                case "...." : temp[i] = "h"; break;
                case ".." : temp[i] = "i"; break;
                case ".---" : temp[i] = "j"; break;
                case "-.-" : temp[i] = "k"; break;
                case ".-.." : temp[i] = "l"; break;
                case "--" : temp[i] = "m"; break;
                case "-." : temp[i] = "n"; break;
                case "---" : temp[i] = "o"; break;
                case ".--." : temp[i] = "p"; break;
                case "--.-" : temp[i] = "q"; break;
                case ".-." : temp[i] = "r"; break;
                case "..." : temp[i] = "s"; break;
                case "-" : temp[i] = "t"; break;
                case "..-" : temp[i] = "u"; break;
                case "...-" : temp[i] = "v"; break;
                case ".--" : temp[i] = "w"; break;
                case "-..-" : temp[i] = "x"; break;
                case "-.--" : temp[i] = "y"; break;
                case "--.." : temp[i] = "z"; break;      
            }
            answer += temp[i];
        }
        
        return answer;
    }
}