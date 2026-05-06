class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        char[] ch = s.toCharArray();
        
        for(int i = 0; i<ch.length; i++){
            if(cnt < 0) answer = false;
            if(ch[i] == '(') cnt++;
            else if(ch[i] == ')') cnt--;
        }
        if(cnt != 0) answer = false;
        return answer;
    }
}
