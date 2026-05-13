import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            q.add(0);
        }
        
        if(bridge_length == 1) return truck_weights.length + 1;
        if(truck_weights.length == 1) return bridge_length + 1;
        
        int ii = 0;
        int w = 0;
        while(ii < truck_weights.length){
            w -= q.poll();
            answer++;
            if(w + truck_weights[ii] <= weight){
                q.add(truck_weights[ii]);
                w += truck_weights[ii];
                ii++;
            }
            else{
                q.add(0);
            }
        }
        return answer + bridge_length;
    }
}
