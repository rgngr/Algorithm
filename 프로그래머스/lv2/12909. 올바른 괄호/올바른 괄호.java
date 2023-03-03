import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack st = new Stack();
        
        // 배열로 했을 때는 효율성 테스트에서 탈락했었다..ㅠㅠ
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
