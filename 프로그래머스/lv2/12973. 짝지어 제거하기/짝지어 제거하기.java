import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack st = new Stack();
        st.add(s.charAt(0));

        for (int i=1; i<s.length(); i++) {
            if (st.empty()) {
                st.add(s.charAt(i));
            } else {
                if (Objects.equals(s.charAt(i), st.peek())) {
                    st.pop();
                } else {
                    st.add(s.charAt(i));
                }
            }
        }
        
        if (st.empty()) answer = 1;
        return answer;
    }
}