// 처음 풀이
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        char[] ch = s.toCharArray();
        
        for(int i = 0; i<ch.length; i++){
            if(cnt < 0){
                answer = false;
            }
            if(ch[i] == '('){
                cnt++;
            }
            else if(ch[i] == ')'){
                cnt--;
            }
        }
        if(cnt != 0){
            answer = false;
        }
        return answer;
    }
}

// 이후 스택 풀이
import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> st = new Stack<>();
        char[] ch = s.toCharArray();
        
        for(int i = 0; i<ch.length; i++){
            if(ch[i] == '('){
                st.push(1);
            }
            else if(ch[i] == ')'){
                if(st.isEmpty()){
                    answer = false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()){
            answer = false;
        }
        return answer;
    }
}
