import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack st = new Stack();
        
        try {
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i)=='(') {
                    st.push('(');
                } else if (s.charAt(i)==')'){
                    st.pop();
                }
            }
            if (st.isEmpty()) {
                return true;
            } else {
                return false;
            }
        } catch (EmptyStackException e) {
            return false;
        }
    }
}