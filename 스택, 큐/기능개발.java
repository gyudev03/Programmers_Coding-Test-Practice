import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            if((100-progresses[i]) % speeds[i] == 0){
                q.add((100-progresses[i]) / speeds[i]);
            }
            else{
                q.add((100-progresses[i]) / speeds[i] + 1);
            }
        }
        int a = q.poll();
        int cnt = 1;
        
        while(!q.isEmpty()){
            if(a >= q.peek()){
                cnt++;
                q.poll();
            }
            else{
                l.add(cnt);
                cnt = 1;
                a = q.poll();
            }
        }
        l.add(cnt);
        
        int[] answer = new int[l.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = l.get(i);
        }
        return answer;
    }
}
