import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (st.empty()) {
                st.push(s.charAt(i));
            } else {
                if (s.charAt(i)==st.peek()) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }
        
        if (st.empty()) answer = 1;
        return answer;
    }
}