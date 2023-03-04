import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> st = new Stack<>(); // 타입 지정 가능

        // push()는 stack에서 제공, add()는 List에서 제공
        // push()의 리턴값은  <E>, add()의 리턴값은 boolean 
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
